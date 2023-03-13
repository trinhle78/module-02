package stop_watch;

public class StopWatch {
    private long stopWatchStartTime = 0;
    private long stopWatchStopTime = 0;
    private boolean stopWatchRunning = false;
    public void start() {
        this.stopWatchStartTime = System.currentTimeMillis();
        this.stopWatchRunning = true;
    }
    public void stop() {
        this.stopWatchStopTime = System.currentTimeMillis();
        this.stopWatchRunning = false;
    }
    public long getElapsedMilliseconds() {
        long elapsedTime;

        if (stopWatchRunning)
            elapsedTime = (System.currentTimeMillis() - stopWatchStartTime);
        else
            elapsedTime = (stopWatchStopTime - stopWatchStartTime);

        return elapsedTime;
    }
}
