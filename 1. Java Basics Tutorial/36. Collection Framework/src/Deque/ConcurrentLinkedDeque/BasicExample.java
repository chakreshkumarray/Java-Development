package Deque.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class BasicExample {
    public static void main(String[] args) {

        ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
        System.out.println(deque.pollFirst());
    }
}

