package Set.CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class BasicExample {
    public static void main(String[] args) {

        CopyOnWriteArraySet<Integer> set = new CopyOnWriteArraySet<>();

        set.add(10);
        set.add(20);
        set.add(10); // duplicate ignored

        System.out.println(set);
    }
}
