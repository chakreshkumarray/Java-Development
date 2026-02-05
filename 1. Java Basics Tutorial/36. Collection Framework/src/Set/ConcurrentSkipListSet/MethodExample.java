package Set.ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class MethodExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("First Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        System.out.println("Floor of 25: " + set.floor(25));
        System.out.println("Ceiling of 25: " + set.ceiling(25));
    }
}
