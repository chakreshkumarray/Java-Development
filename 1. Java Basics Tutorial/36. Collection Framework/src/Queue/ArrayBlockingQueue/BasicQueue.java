package Queue.ArrayBlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class BasicQueue {
    public static void main(String[] args) {

    ArrayBlockingQueue<Integer> queue = new ArrayBlockingQueue<>(3);

    queue.offer(1);
    queue.offer(2);
    queue.offer(3);
    boolean added = queue.offer(4);
    System.out.println("Was 4th element added? " + added);

    System.out.println("Head is: " + queue.peek());

    System.out.println("Removed: " + queue.poll());
  }
}


