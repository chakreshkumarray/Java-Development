package To_6_CollectionClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(9);

        Collections.sort(list);
        Collections.reverse(list);
        List<Integer> unmodifiableList =  Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);

        System.out.println(list);

    }
}
