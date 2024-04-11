package rs.raf.pds.faulttolerance.commands;

import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class AddValueCommand extends Command{
	final Float value;
	
	public AddValueCommand(float value) {
		this.value = value;
	}
	
	@Override
	public void serialize(DataOutputStream os) throws IOException {
      os.writeInt(Command.AddValueType);
      os.writeUTF(value.toString());
  	}
	@Override 
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.AddValueType).append(' ').append(value);
		
		return sb.toString();
	}
	public Float getValue() {
		return value;
	}

	public static AddValueCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new AddValueCommand(Float.parseFloat(dataInputStream.readUTF()));
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	  }
}
