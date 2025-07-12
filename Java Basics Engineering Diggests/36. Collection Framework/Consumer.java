package Queue.Queue.BlockingQueue.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                Integer value = queue.take();
                System.out.println("Consumer consumed : " +value);
                Thread.sleep(2000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Consumer Interrupted");
            }
        }

    }
}
