package Deque.ConcurrentLinkedDeque;

import java.util.concurrent.ConcurrentLinkedDeque;

public class AdvancedExample {

    static ConcurrentLinkedDeque<Integer> deque = new ConcurrentLinkedDeque<>();

    public static void main(String[] args) {

        Runnable producer = () -> {
            for (int i = 1; i <= 5; i++) {
                deque.addLast(i);
                System.out.println("Produced " + i);
            }
        };

        Runnable consumer = () -> {
            Integer value;
            while ((value = deque.pollFirst()) != null) {
                System.out.println("Consumed " + value);
            }
        };

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);

        t1.start();
        t2.start();
    }
}

