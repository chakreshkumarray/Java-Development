package Queue.Deque.LinkedListDeque;
import java.util.Deque;
import java.util.LinkedList;

public class Functionality {
    public static void main(String[] args) {
        Deque<Integer> list = new LinkedList<>();

        // Add First , Add Last
        list.addFirst(2);
        list.addLast(3);

        // Offer First , Offer Last
        list.offerFirst(9);
        list.offerLast(7);

        // Remove First , Remove Last
        list.removeFirst();
        list.removeLast();

        // Poll First , Poll Last
        list.pollFirst();
        list.pollLast();

        // Get First , Get Last
        list.getFirst();
        list.getLast();

        // Peek First , Peek Last
        list.peekFirst();
        list.peekLast();

        System.out.println(list);

    }
}
