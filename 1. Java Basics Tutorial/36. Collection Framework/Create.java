package Queue.Queue.BlockingQueue.SynchronousQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.SynchronousQueue;

public class Create {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new SynchronousQueue<>();
        Thread producer = new Thread(()->{
            try {
                System.out.println("Producer is waiting to transfer. ");
                queue.put("Hello from producer ! ");
                System.out.println("Producer has transfer the message..");
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.err.println("Producer was Interrupted.");
            }
        });

        Thread consumer = new Thread(()->{
            try {
                System.out.println("Consumer is waiting to receive. ");
                String message = queue.take();
                System.out.println("Consumer received : "+ message);
            } catch (Exception e) {
                Thread.currentThread().interrupt();
                System.err.println("Consumer was Interrupted.");
            }
        });
        producer.start();
        consumer.start();
    }
}
