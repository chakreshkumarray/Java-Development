package List.Stack;
import java.util.LinkedList;

public class Linked_As_Stack {
    public static void main(String[] args) {
        LinkedList<Integer> list = new  LinkedList<Integer>();

        // Linked List using  as Stack
        // Add Or Push
        list.addLast(3);
        list.addLast(9);
        list.addLast(7);
        list.addLast(5);
        list.addLast(6);
        System.out.println(list);

        // Get
        list.getLast();
        System.out.println(list.getLast());
        System.out.println(list);

        // Remove Or Pop
        list.removeLast();
        System.out.println(list.removeLast());
        System.out.println(list);

        // Peek
        list.peek();
        System.out.println(list.peek());

        // Size
        list.size();
        System.out.println(list.size());

        // Is Empty
        list.isEmpty();
        System.out.println(list.isEmpty());


    }
}
