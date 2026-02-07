package Queue.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{

    private final BlockingQueue<Integer> queue;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true){
            try {
                System.out.println("Producer produced : "+value);
                queue.put(value++);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
                System.out.println("Producer Interrupted");
            }
        }
    }

}
