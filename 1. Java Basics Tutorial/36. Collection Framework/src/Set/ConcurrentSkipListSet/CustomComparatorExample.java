package Set.ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class CustomComparatorExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> set =
                new ConcurrentSkipListSet<>((a, b) -> b - a);

        set.add(5);
        set.add(2);
        set.add(8);
        set.add(1);

        System.out.println(set);
    }
}
