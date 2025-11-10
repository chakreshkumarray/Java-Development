package Set.LinkedSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstLinkedSet {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
        set.add(3);
        set.add(4);
        set.remove(4);
        System.out.println(set.size());

    }
}
