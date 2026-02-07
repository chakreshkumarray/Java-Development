package Deque.LinkedList;
import java.util.LinkedList;

public class StackUsingDeque {
    public static void main(String[] args) {

        LinkedList<String> deque = new LinkedList<>();
        deque.push("A");
        deque.push("B");
        deque.push("C");
        System.out.println(deque.pop());

    }
}
