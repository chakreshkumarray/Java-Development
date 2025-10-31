package To_3_List.ArrayList;
import java.util.ArrayList;

public class initialCapacity {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>(1000);

        //  Find  size
        System.out.println(list.size());

        // Find element value
        System.out.println(list.get(0));

    }
}
