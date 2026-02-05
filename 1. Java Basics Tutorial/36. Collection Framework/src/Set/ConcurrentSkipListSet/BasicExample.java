package Set.ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class BasicExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();
        set.add(50);
        set.add(10);
        set.add(30);
        set.add(10); // duplicate (ignored)

        System.out.println("Set Elements: " + set);
    }
}
