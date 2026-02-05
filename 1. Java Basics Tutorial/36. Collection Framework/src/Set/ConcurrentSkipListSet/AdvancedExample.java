package Set.ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class AdvancedExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        for (int i = 1; i <= 10; i++) {
            set.add(i);
        }

        Thread removeThread = new Thread(() -> {
            set.remove(3);
            set.remove(7);
        });

        Thread addThread = new Thread(() -> {
            set.add(15);
            set.add(20);
        });

        removeThread.start();
        addThread.start();

        try {
            removeThread.join();
            addThread.join();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Updated Set: " + set);
    }
}
