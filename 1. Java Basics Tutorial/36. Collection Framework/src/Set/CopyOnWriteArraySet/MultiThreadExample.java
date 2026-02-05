package Set.CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class MultiThreadExample {
    public static void main(String[] args){

        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

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
            throw new RuntimeException(e);
        }

        System.out.println(set);
    }
}
