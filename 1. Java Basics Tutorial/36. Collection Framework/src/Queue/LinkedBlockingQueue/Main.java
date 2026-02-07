package Queue.LinkedBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue<String> logQueue = new LinkedBlockingQueue<>(10);

        boolean success = logQueue.offer("LOG_EVENT_1", 2, TimeUnit.SECONDS);

        if (success) {
            System.out.println("Log buffered: " + logQueue.peek());
        }

        String log = logQueue.take();
        System.out.println("Processing: " + log);
    }
}

