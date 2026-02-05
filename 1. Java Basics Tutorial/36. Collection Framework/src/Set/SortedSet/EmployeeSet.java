package Set.SortedSet;

import java.util.SortedSet;
import java.util.TreeSet;

public class EmployeeSet {
    public static void main(String[] args) {

        SortedSet<Employee> set = new TreeSet<>(
                (e1, e2) -> e1.id - e2.id
        );

        System.out.println(set);
    }
}
