package List.Arrays.Comparator;
import Map.HashMap.Comparable.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MethodComparing {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Akash", 3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student :: getName); // -> getName

        list.sort(comparator);
        for (Student s : list) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }

        Collections.sort(list,comparator);
        list.sort(comparator);
    }
}
