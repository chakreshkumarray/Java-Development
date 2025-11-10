package To_5_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FirstSet {
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Set<String> set1 = new TreeSet<>();
        Set<Double> set2 = new LinkedHashSet<>();

        set.add(5);
        set.add(3);
        set.add(2);
        set.add(6);
        set.remove(6);
        set.add(6);
        System.out.println(set.isEmpty());
        System.out.println(set.contains(2));
        System.out.println(set.size());
        System.out.println(set);

        set1.add("Ck");
        set1.add("Ak");
        set1.add("DK");
        set1.add("AK");
        System.out.println(set1.size());
        System.out.println(set1);



    }
}
