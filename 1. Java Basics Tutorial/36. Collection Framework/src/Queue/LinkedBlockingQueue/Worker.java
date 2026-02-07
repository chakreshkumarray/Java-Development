package Queue.LinkedBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Worker implements Runnable {

    private final LinkedBlockingQueue<String> queue;
    private final int workerId;

    public Worker(LinkedBlockingQueue<String> queue, int id) {
        this.queue = queue;
        this.workerId = id;
    }

    @Override
    public void run() {
        try {
            while (true) {
                // Blocks here until a task is available
                String task = queue.take();

                // The "Poison Pill" check
                if (task.equals("SHUTDOWN")) {
                    System.out.println("Worker " + workerId + " shutting down.");
                    break;
                }

                System.out.println("Worker " + workerId + " processing: " + task);
                Thread.sleep(1000); // Simulate heavy work
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
