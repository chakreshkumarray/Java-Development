package List.ArraysArrayList;
import java.util.ArrayList;
import java.util.Collections;

public class SortingArray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(45);
        list.add(87);
        list.add(74);
        list.add(32);
        list.add(65);
        System.out.println(list);

        // Sorting Array List
        Collections.sort(list);
        // OR
        list.sort(null);

        System.out.println(list);
    }
}
