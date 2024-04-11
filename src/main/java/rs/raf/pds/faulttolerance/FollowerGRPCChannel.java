package rs.raf.pds.faulttolerance;

import rs.raf.pds.faulttolerance.gRPC.AccountServiceGrpc;

public class FollowerGRPCChannel {
	final String zkNode;
	final String connectionString;
	final AccountServiceGrpc.AccountServiceBlockingStub blockingStub;
	
	public FollowerGRPCChannel(String zkNode, String connectionString, AccountServiceGrpc.AccountServiceBlockingStub blockingStub){
		this.zkNode = zkNode;
		this.connectionString = connectionString;
		this.blockingStub = blockingStub;
	}

	public String getZkNode() {
		return zkNode;
	}

	public String getConnectionString() {
		return connectionString;
	}

	public AccountServiceGrpc.AccountServiceBlockingStub getBlockingStub() {
		return blockingStub;
	}
	
	
	
}
