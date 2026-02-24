package List.ArraysArrayList;
import java.util.ArrayList;
import java.util.List;

public class Remove_Value {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(23);
        list.add(55);
        list.add(79);
        list.add(25);

        // Remove Direct Value
        list.remove(Integer.valueOf(23));
        System.out.println(list);

        List<String> list1 = new ArrayList<>(List.of("Banana", "Mango", "Apple", "Orange", "Papaya", "Grapes"));

        // Remove String
        list1.remove("Apple");
        System.out.println(list1);

    }
}
