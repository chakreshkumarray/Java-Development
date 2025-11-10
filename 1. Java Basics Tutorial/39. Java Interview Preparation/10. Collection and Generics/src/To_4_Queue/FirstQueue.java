package To_4_Queue;

import java.util.LinkedList;
import java.util.Queue;

public class FirstQueue {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.offer(1);
        queue.add(6);
        queue.add(12);
        queue.add(62);
        queue.add(15);
        queue.add(13);
        queue.remove(3);

        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.element());
        System.out.println(queue);
    }
}
