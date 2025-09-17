package List.Vector;
import java.util.LinkedList;
import java.util.Vector;

public class Constructor {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        Vector<Integer> vector = new Vector<>(linkedList);
        System.out.println(vector);

    }
}
