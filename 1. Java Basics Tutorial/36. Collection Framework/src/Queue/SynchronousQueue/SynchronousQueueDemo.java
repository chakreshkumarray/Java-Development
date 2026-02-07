package Queue.SynchronousQueue;
import java.util.concurrent.SynchronousQueue;
public class SynchronousQueueDemo {

    public static void main(String[] args) {

        SynchronousQueue<Integer> queue =
                new SynchronousQueue<>(true);

        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Produced " + i);
                    queue.put(i); // waits for consumer
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 3; i++) {
                    System.out.println("Consumed " + queue.take()); // waits for producer
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        };

        Thread producerThread = new Thread(producer, "Producer-Thread");
        Thread consumerThread = new Thread(consumer, "Consumer-Thread");

        producerThread.start();
        consumerThread.start();
    }
}

