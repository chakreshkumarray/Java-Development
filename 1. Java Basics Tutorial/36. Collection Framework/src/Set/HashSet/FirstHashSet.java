package Set.HashSet;

import java.util.HashSet;
import java.util.Set;

public class FirstHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.remove(4);
        System.out.println(set);
    }
}
