package List.Arrays.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Elements_Adding {
    public static void main(String[] args) {

        List <Integer> list = new ArrayList<>();
        list.add(23);
        list.add(55);
        list.add(78);

        // Specific place

        list.add(1,65);
        System.out.println(list);

        // Add All

        List<Integer> list1 = List.of(4,5,7,89,22,78);
        list.addAll(list1);
        System.out.println(list);

    }
}
