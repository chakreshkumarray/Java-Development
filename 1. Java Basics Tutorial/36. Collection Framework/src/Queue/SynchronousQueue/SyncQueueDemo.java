package Queue.SynchronousQueue;

import java.util.concurrent.*;
public class SyncQueueDemo {

    public static void main(String[] args) {

        SynchronousQueue<String> queue = new SynchronousQueue<>();

        // Producer
        new Thread(() -> {
            try {
                System.out.println("Producing...");
                queue.put("Task-1");  // BLOCKS
                System.out.println("Produced");
            } catch (InterruptedException e) {}
        }).start();

        // Consumer
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Consuming...");
                System.out.println(queue.take());
            } catch (InterruptedException e) {}
        }).start();
    }
}

