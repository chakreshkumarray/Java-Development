package Queue.Queue.BlockingQueue.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayTask implements Delayed {

    private final String taskName;
    private final long startTime;

    public DelayTask(String taskName, long delay, TimeUnit unit) {
        this.taskName = taskName;
        this.startTime = System.currentTimeMillis() + unit.toMillis(delay);
    }

    public String getTaskName() {
        return taskName;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long remaining = startTime - System.currentTimeMillis();
        return unit.convert(remaining,TimeUnit.MICROSECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        if (this.startTime < ((DelayTask)o).startTime){
            return -1;
        }
        if (this.startTime > ((DelayTask)o).startTime){
            return 1;
        }
        return 0;
    }
}
