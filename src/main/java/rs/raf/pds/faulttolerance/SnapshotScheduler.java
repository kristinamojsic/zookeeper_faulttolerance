package rs.raf.pds.faulttolerance;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SnapshotScheduler {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

    public void startSnapshotRoutine(AccountService accountService, ReplicatedLog replicatedLog, long interval, TimeUnit timeUnit,String fileName) {
        Runnable task = new Runnable() {
            public void run() {
                accountService.takeSnapshot();
                replicatedLog.takeSnapshot();
                System.out.println("Snapshots taken successfully");
                clearLogFile(fileName);
            }
        };

        scheduler.scheduleAtFixedRate(task, 0, interval, timeUnit);
    }
    private void clearLogFile(String fileName) {
        try {
            File file = new File(fileName);
            FileWriter fw = new FileWriter(file);
            fw.write("");
            fw.close();
            System.out.println("Log file cleared: " + fileName);
        } catch (IOException e) {
            System.err.println("Error clearing log file: " + e.getMessage());
        }
    }
}
