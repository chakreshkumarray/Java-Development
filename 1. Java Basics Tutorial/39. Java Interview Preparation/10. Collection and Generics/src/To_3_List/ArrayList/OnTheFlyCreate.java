package To_3_List.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OnTheFlyCreate {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        System.out.println(list.getClass().getName());

        List<String> list1 =  Arrays.asList("ck","ak");
        System.out.println(list1.getClass().getName());
        list1.set(1,"su");
        System.out.println(list1.get(1));

        String[] array = {"Mon","Tues","Wed","Thu"};
        List<String> list2 =  Arrays.asList(array);
        System.out.println(list2.getClass().getName());

        List list3 = List.of(1,2,3,4,5); // Immutable
        System.out.println(list3);
        System.out.println(list3.getClass().getName());

        List<String> list4 =  new ArrayList<>(list3);
        list4.add("Mango");
        list4.add("Banana");
        System.out.println(list4);
        System.out.println(list4.getClass().getName());

    }

}
