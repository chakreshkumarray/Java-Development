package Queue.PriorityBlockingQueue;

import java.util.concurrent.PriorityBlockingQueue;

public class PriorityJobScheduler {
    public static void main(String[] args) {

        PriorityBlockingQueue<Job> queue = new PriorityBlockingQueue<>();

        // Workers
        Thread w1 = new Thread(new Worker(queue), "Worker-1");
        Thread w2 = new Thread(new Worker(queue), "Worker-2");

        // Producer
        Thread producer = new Thread(new JobProducer(queue));

        w1.start();
        w2.start();
        producer.start();
    }
}
