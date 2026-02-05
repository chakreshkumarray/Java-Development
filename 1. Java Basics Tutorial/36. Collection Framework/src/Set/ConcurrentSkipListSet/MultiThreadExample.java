package Set.ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class MultiThreadExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        Runnable task = () -> {
            for (int i = 1; i <= 5; i++) {
                set.add(i);
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Final Set: " + set);
    }
}
