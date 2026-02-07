package Queue.LinkedBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class AdvancedSystem {
    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue<String> taskQueue = new LinkedBlockingQueue<>(100);

        for (int i = 1; i <= 3; i++) {
            new Thread(new Worker(taskQueue, i)).start();
        }

        for (int i = 1; i <= 10; i++) {
            taskQueue.put("Task-" + i);
        }

        for (int i = 0; i < 3; i++) {
            taskQueue.put("SHUTDOWN");
        }
    }
}
