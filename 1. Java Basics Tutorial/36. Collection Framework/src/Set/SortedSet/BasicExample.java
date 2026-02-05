package Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class BasicExample {
    public static void main(String[] args) {

        SortedSet<Integer> set = new TreeSet<>();

        set.add(30);
        set.add(10);
        set.add(20);

        System.out.println(set);

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println(set.headSet(30)); // [10, 20]
        System.out.println(set.tailSet(20)); // [20, 30, 40]
        System.out.println(set.subSet(20, 40)); // [20, 30]
    }
}
