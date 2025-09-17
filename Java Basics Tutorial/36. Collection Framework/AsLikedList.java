package Queue.Queue.LinkedList;
import java.util.LinkedList;

public class AsLikedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // Add or Enqueue
        list.addLast(3);
        list.addLast(5);
        list.addLast(11);
        list.addLast(9);

        // Remove or Dequeue
        list.remove(0);
        list.remove(1);
        System.out.println(list);

    }
}
