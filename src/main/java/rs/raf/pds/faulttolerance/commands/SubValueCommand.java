package rs.raf.pds.faulttolerance.commands;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class SubValueCommand extends Command{
	final Float value;

	public SubValueCommand(float value) {
		this.value = value;
	}

	@Override
	public void serialize(DataOutputStream os) throws IOException {
		// greska?
      os.writeInt(Command.AddValueType);
      os.writeUTF(value.toString());
  	}

	@Override
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.SubValueType).append(' ').append(value);

		return sb.toString();
	}

	public Float getValue() {
		return value;
	}

	public static SubValueCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new SubValueCommand(Float.parseFloat(dataInputStream.readUTF()));
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	}
}
