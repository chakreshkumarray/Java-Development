package Set.CopyOnWriteArraySet;

import java.util.concurrent.CopyOnWriteArraySet;

public class IterationExample {
    public static void main(String[] args) {

        CopyOnWriteArraySet<String> set =
                new CopyOnWriteArraySet<>();

        set.add("Java");
        set.add("Spring");

        for (String s : set) {
            set.add("Docker"); // allowed
            set.add("Chakresh");
            set.add("Kumar");
            set.add("Ray");
            set.remove("Docker");
            System.out.println(s);
        }

        System.out.println(set);
    }
}
