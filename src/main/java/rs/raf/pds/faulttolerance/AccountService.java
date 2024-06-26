package rs.raf.pds.faulttolerance;

import rs.raf.pds.faulttolerance.commands.AddValueCommand;
import rs.raf.pds.faulttolerance.commands.Command;
import rs.raf.pds.faulttolerance.commands.SubValueCommand;
import rs.raf.pds.faulttolerance.gRPC.*;

import java.io.*;
import java.util.Scanner;

public class AccountService {

	ByteArrayInputStream bais;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();

	DataInputStream dis = new DataInputStream(bais);
	DataOutputStream dos = new DataOutputStream(baos);


	boolean isLeader = false;
	float amount = 0.0f;
	ReplicatedLog log;

	public AccountService(ReplicatedLog log) {
		this.log = log;
	}

	public float addAmount(float value, boolean applyLog) {

		if (applyLog) {
			AddValueCommand command = new AddValueCommand(value);
			appendCommandToLogAndReplicate(command);
		}
		amount += value;

		return amount;
	}
	public float witdrawAmount(float value, boolean applyLog) {

		if (amount>=value) {

			if (applyLog) {
				SubValueCommand command = new SubValueCommand(value);
				appendCommandToLogAndReplicate(command);
			}

			amount -= value;

			return amount;

		}else
		{
			return -1;

		}

	}

	public void appendCommandToLogAndReplicate(Command command) {
		try {
			//command.serialize(dos);
			//log.appendAndReplicate(baos.toByteArray());
			//baos.reset();

			log.appendAndReplicate(command.writeToString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public AccountResponse getAmount(AccountRequest req) {
		AccountResponse resp = AccountResponse.newBuilder()
				.setRequestId(req.getRequestId())
				.setBalance(amount)
				.setStatus(RequestStatus.STATUS_OK)
				.build();

		return resp;
	}
	//komadna za upis u log je "commandType(int) 1 or 2" "amount(float)"
	public LogResponse appendLog(Long entryIndex, byte[] data) throws IOException {


		if (log.getLastLogEntryIndex()<(entryIndex-1)) {
			LogResponse response = LogResponse.newBuilder().
									setStatus(LogStatus.LOG_HASNT_LAST_ENTRY).
									setLastEntryIndex(log.lastLogEntryIndex).
									setEntryAtIndex(entryIndex).
									build();
			return response;
		}

		log.appendToLocalLog(data);

		//DataInputStream ds = new DataInputStream(new ByteArrayInputStream(data));
		Scanner sc = new Scanner(new String(data));

		//int commandType = ds.readInt();
		int commandType = sc.nextInt();

		if (commandType == Command.AddValueType) {
			//AddValueCommand command = AddValueCommand.deserialize(ds);
			AddValueCommand command = new AddValueCommand(sc.nextFloat());
			addAmount(command.getValue(), false);

		}else if (commandType == Command.SubValueType) {
			//SubValueCommand command = SubValueCommand.deserialize(ds);
			SubValueCommand command = new SubValueCommand(sc.nextFloat());
			witdrawAmount(command.getValue(), false);
		}

		LogResponse response = LogResponse.newBuilder().
				setStatus(LogStatus.LOG_OK).
				setEntryAtIndex(entryIndex).
				build();

		return response;
	}

	public void setServerState(boolean isLeader) {
		this.isLeader = isLeader;
	}

	public synchronized void takeSnapshot() {
		try
		{
			FileOutputStream fileOutputStream = new FileOutputStream("snapshot.ser");
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
			System.out.println(this.amount);
			objectOutputStream.writeObject(this.amount);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("Snapshot taken successfully");
		}
		catch (IOException i) {
			i.printStackTrace();
		}
	}
	public void loadSnapshot() {
		try {
			FileInputStream fileInputStream = new FileInputStream("snapshot.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			this.amount = (float) objectInputStream.readObject();
			System.out.println("Loaded last amount: " + amount);
			objectInputStream.close();
			fileInputStream.close();
		} catch (IOException | ClassNotFoundException i) {
			i.printStackTrace();
		}
	}


}
