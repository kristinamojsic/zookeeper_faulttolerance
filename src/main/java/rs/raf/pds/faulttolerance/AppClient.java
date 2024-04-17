package rs.raf.pds.faulttolerance;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import rs.raf.pds.faulttolerance.gRPC.*;
import rs.raf.pds.zookeeper.core.SyncPrimitive;

import java.util.ArrayList;
import java.util.List;

public class AppClient extends SyncPrimitive {

	final String appRoot;
	String leaderNodeName = null;
	String leaderHostNamePort;
	List<String> list = new ArrayList<>();
	ManagedChannel channel = null;
	AccountServiceGrpc.AccountServiceBlockingStub blockingStub = null;
	AccountServiceGrpc.AccountServiceBlockingStub followerBlockingStub = null;
	protected AppClient(String zkAddress, String appRoot) throws KeeperException, InterruptedException {
		super(zkAddress);
		this.appRoot = appRoot;
	}
	@Override
	public void process(WatchedEvent event) {
		try {
			checkLeader();
		} catch (KeeperException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    public synchronized void checkLeader() throws KeeperException, InterruptedException {
		//Thread.sleep(100);
    	list = zk.getChildren(appRoot, false);
        System.out.println("There are total:"+list.size()+ " replicas for elections!");
        for (int i=0; i<list.size(); i++)
        	System.out.print("NODE:"+list.get(i)+", ");
        System.out.println();

        if (list.size() == 0) {
            System.out.println("0 Elemenata ? ");
        } else {
            Integer minValue = Integer.parseInt(list.get(0).substring(AppServer.REPLICA_NODE_SEQUENCE_INDEX));
            String minNodeName = list.get(0);

            for(int i=1; i<list.size(); i++) {
            	Integer tempValue = Integer.parseInt(list.get(i).substring(AppServer.REPLICA_NODE_SEQUENCE_INDEX));
                if(minValue > tempValue) {
                  minValue = tempValue;
                  minNodeName = list.get(i);
                }
            }
            if (leaderNodeName == null || !minNodeName.equals(leaderNodeName)) {
            	leaderNodeName = minNodeName;
            	byte[] b = zk.getData(appRoot + "/" + leaderNodeName, true, null);
            	leaderHostNamePort = new String(b);

            	System.out.println("Leader je "+leaderNodeName);

				if (!isLeaderActive(leaderHostNamePort)) {
					System.out.println("Waiting for leader...");
					Thread.sleep(2000);
					checkLeader();
				}
				else {
					blockingStub = getBlockingStub(leaderHostNamePort);
				}
				for (String nodeName : list) {
					if (!nodeName.equals(leaderNodeName)) {
						byte[] followerData = zk.getData(appRoot + "/" + nodeName, true, null);
						String followerHostNamePort = new String(followerData);
						followerBlockingStub = getBlockingStub(followerHostNamePort);
					}
				}
            }
        }
	}
	private boolean isLeaderActive(String leaderHostNamePort) {
		ManagedChannel channel = null;
		try {
			String[] splits = leaderHostNamePort.split(":");
			channel = ManagedChannelBuilder.forAddress(splits[0], Integer.parseInt(splits[1]))
					.usePlaintext()
					.build();
			AccountServiceGrpc.AccountServiceBlockingStub blockingStub = AccountServiceGrpc.newBlockingStub(channel);

			AccountRequest request = AccountRequest.newBuilder()
					.setRequestId(1)
					.setOpType(AccountRequestType.GET)
					.build();

			AccountResponse response = blockingStub.getAmount(request);
			return (response != null && response.getStatus() == RequestStatus.STATUS_OK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		} finally {
			if (channel != null) {
				channel.shutdown();
			}
		}
	}
    public  AccountServiceGrpc.AccountServiceBlockingStub getBlockingStub(String hostNamePort){
		String[] splits = hostNamePort.split(":");
		channel = ManagedChannelBuilder.forAddress(splits[0], Integer.parseInt(splits[1]))
	          .usePlaintext()
	          .build();

	    return AccountServiceGrpc.newBlockingStub(channel);
	}
	private void inviteServer() throws KeeperException, InterruptedException {
		for (int i=0; i<7; i++) {
	        try {

	        	inviteServerFunctions(blockingStub);

	        	Thread.sleep(2000);

	        	System.out.println("Leader je "+leaderNodeName);

	        }catch(RuntimeException e) {
	        	System.out.println("Server has crashed!");
	        	e.printStackTrace();
	        	//channel.shutdown();

	        	checkLeader();

	        } catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

        channel.shutdown();
	}
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage java -cp PDS-FT1-1.0.jar;.;lib/* rs.raf.pds.faulttolerance.AppClient <zookeeper_server_host:port>");
		    System.exit(1);
		}

		AppClient client;
		try {
			client = new AppClient(args[0], AppServer.APP_ROOT_NODE);
			client.checkLeader();
			client.inviteServer();


		} catch (KeeperException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



    }


	private void inviteServerFunctions(AccountServiceGrpc.AccountServiceBlockingStub blockingStub) {
		// Poziv AppServer-a preko gRPC-a
        System.out.println("Prvi poziv je getAmount()");
        AccountRequest request = AccountRequest.newBuilder()
        			.setRequestId(1)
        			.setOpType(AccountRequestType.GET)
        			.build();

        AccountResponse responseLeader;
		AccountResponse[] responsesFollowers;

        synchronized(this) {
			responseLeader = blockingStub.getAmount(request);
			responsesFollowers = new AccountResponse[list.size() - 1];
			int i = 0;
			for (String nodeName : list) {
				if (!nodeName.equals(leaderNodeName)) {
					AccountRequest followerRequest = AccountRequest.newBuilder()
							.setRequestId(1)
							.setOpType(AccountRequestType.GET)
							.build();

					AccountResponse followerResponse = followerBlockingStub.getAmount(followerRequest);


					responsesFollowers[i++] = followerResponse;
				}
			}

        }
		ispisResponse(responseLeader, request);

		for (int i = 0; i < responsesFollowers.length; i++) {
			ispisResponse(responsesFollowers[i], request);
		}



        System.out.println("Drugi poziv je addAmount()");
        request = AccountRequest.newBuilder()
        			.setRequestId(2)
        			.setOpType(AccountRequestType.ADD)
        			.setAmount(150.0f)
        			.build();
        synchronized(this) {
        	responseLeader = blockingStub.addAmount(request);
        }
        ispisResponse(responseLeader, request);



        System.out.println("Treci poziv je witdrawAmount()");
        request = AccountRequest.newBuilder()
        			.setRequestId(2)
        			.setOpType(AccountRequestType.ADD)
        			.setAmount(70.0f)
        			.build();

        synchronized(this) {
        	responseLeader = blockingStub.witdrawAmount(request);
        }
        ispisResponse(responseLeader, request);


        /*System.out.println("Cetvrti poziv je witdrawAmount()");
        request = AccountRequest.newBuilder()
        			.setRequestId(2)
        			.setOpType(AccountRequestType.ADD)
        			.setAmount(100.0f)
        			.build();
        synchronized(this) {
        	response = blockingStub.witdrawAmount(request);
        }
        ispisResponse(response, request);*/
	}

	public static void ispisResponse(AccountResponse response, AccountRequest request) {
		if (response.getStatus() == RequestStatus.STATUS_OK) {
			System.out.println("STATUS OK! REQUEST = "+request.getOpType()+ ", AMOUNT = "+response.getBalance());
		}else if (response.getStatus() == RequestStatus.UPDATE_REJECTED_NOT_LEADER) {
			System.out.println("UPDATE_REJECTED_NOT_LEADER! "+request.getOpType().toString());
		}
		else if (response.getStatus() == RequestStatus.WITDRAWAL_REJECT_NOT_SUFFICIENT_AMOUNT) {
			System.out.println(".WITDRAWAL_REJECT_NOT_SUFFICIENT_AMOUNT! Amount"+request.getAmount());
		}

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
