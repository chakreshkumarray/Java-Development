package List.Comparator;
import java.util.ArrayList;
import java.util.Comparator;

public class IntegerComparator {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(23);
        list.add(52);
        list.add(41);
        list.add(22);
        list.add(19);
                         // Ascending and Descending Order
        list.sort(new Comparator<Integer>() {
           @Override
           public int compare(Integer i1, Integer i2) {
               return i2-i1;
           }
       });

        System.out.println(list);

    }
}
