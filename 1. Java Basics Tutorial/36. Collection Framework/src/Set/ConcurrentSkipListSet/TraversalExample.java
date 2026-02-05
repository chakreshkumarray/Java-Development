package Set.ConcurrentSkipListSet;

import java.util.concurrent.ConcurrentSkipListSet;

public class TraversalExample {
    public static void main(String[] args) {

        ConcurrentSkipListSet<String> set = new ConcurrentSkipListSet<>();

        set.add("Java");
        set.add("Spring");
        set.add("Microservices");

        for (String s : set) {
            System.out.println(s);
        }
    }
}
