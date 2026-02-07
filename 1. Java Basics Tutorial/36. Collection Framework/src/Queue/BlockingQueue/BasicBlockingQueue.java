package Queue.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BasicBlockingQueue {
    public static void main(String[] args) throws InterruptedException {

        BlockingQueue<String> queue = new ArrayBlockingQueue<>(2);

        System.out.println("1. Adding 'A'...");
        queue.put("A");

        System.out.println("2. Adding 'B'...");
        queue.put("B");

        System.out.println("3. Attempting to add 'C' (Queue is full)...");

        // UNCOMMENTING THE LINE BELOW WILL FREEZE THE PROGRAM FOREVER
        // queue.put("C");

        System.out.println("   (If I uncomment line 18, this line is never reached!)");

        System.out.println("4. Removing head: " + queue.take());
        System.out.println("   (Now there is space for 'C' if we tried again)");
    }
}
