package Queue.PriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

class JobProducer implements Runnable {

    private final PriorityBlockingQueue<Job> queue;

    public JobProducer(PriorityBlockingQueue<Job> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 6; i++) {
            int priority = (int) (Math.random() * 10);
            Job job = new Job(i, priority, 1000);

            queue.put(job);
            System.out.println("Submitted " + job);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {}
        }
    }
}

