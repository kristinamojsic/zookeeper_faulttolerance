package rs.raf.pds.faulttolerance.commands;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Command {

	public static int AddValueType = 1;
	public static int SubValueType = 2;
	
	public void serialize(DataOutputStream os) throws IOException {
		
	}
	
	public abstract String writeToString();		
	
}
	

