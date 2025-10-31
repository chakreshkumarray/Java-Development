package To_3_List.Comparator;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Alice", 3.5));
        list.add(new Student("Bob", 3.7));
        list.add(new Student("Charlie", 3.5));
        list.add(new Student("Akash", 3.9));

        list.sort((o1, o2) -> {
            if (o2.getGpa() - o1.getGpa()>0){
                return 1;
            }else if (o2.getGpa() - o1.getGpa()<0){
                return -1;
            }else {
                return  0;
            }
        });
        for (Student s : list) {
            System.out.println(s.getName() + " : " + s.getGpa());
        }


    }
}
