package rs.raf.pds.faulttolerance;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReplicatedLog {

	public static interface LogReplicator {
		public void replicateOnFollowers(Long entryAtIndex, byte[] data);
	}

	Long lastLogEntryIndex = 0L;
	final LogReplicator node;
	FileOutputStream fs;
	OutputStreamWriter writer;
	// dodato polje za naziv fajla, da bi se citalo iz njega
	private final String fileName;
	public ReplicatedLog(String fileName, LogReplicator node) throws FileNotFoundException {
		this.node = node;
		this.fileName = fileName;
		fs = new FileOutputStream(fileName,true);
		writer = new OutputStreamWriter(fs);
	}

	public void appendAndReplicate(byte[] data) throws IOException {
		Long lastLogEntryIndex = appendToLocalLog(data);
		// implementacija ove funkcije? -- u AppServer
		node.replicateOnFollowers(lastLogEntryIndex, data);
	}

	protected Long appendToLocalLog(byte[] data) throws IOException {
		String s = new String(data);
		System.out.println("Log #"+lastLogEntryIndex+":"+s);

		//fs.write(data);
		//fs.flush();
		writer.write(s);writer.write("\r\n");
		writer.flush();
		fs.flush();

		return ++lastLogEntryIndex;
	}

	protected Long getLastLogEntryIndex() {
		return lastLogEntryIndex;
	}

	// funkcija za citanje loga
	public List<String> readAllEntries() throws IOException {
		List<String> entries = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(this.fileName));
		String line;
		while ((line = reader.readLine()) != null) {
			entries.add(line);
		}
		reader.close();
		return entries;
	}
}
