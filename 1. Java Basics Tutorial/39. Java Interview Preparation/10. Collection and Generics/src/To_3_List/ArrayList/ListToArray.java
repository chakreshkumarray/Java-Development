package To_3_List.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<Integer>();
        list.add(20);
        list.add(54);
        list.add(23);

        // Syntax
        Object[] array =  list.toArray();

        Integer[] array1 = list.toArray(new Integer[0]);
        System.out.println(Arrays.toString(array1));
    }
}
