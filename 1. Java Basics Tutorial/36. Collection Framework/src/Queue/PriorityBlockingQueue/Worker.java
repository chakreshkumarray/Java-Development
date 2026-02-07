package Queue.PriorityBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

class Worker implements Runnable {

    private final PriorityBlockingQueue<Job> queue;

    public Worker(PriorityBlockingQueue<Job> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Job job = queue.take(); // BLOCKS if empty
                System.out.println(Thread.currentThread().getName()
                        + " started " + job);

                Thread.sleep(job.getExecutionTime());

                System.out.println(Thread.currentThread().getName()
                        + " completed " + job);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

