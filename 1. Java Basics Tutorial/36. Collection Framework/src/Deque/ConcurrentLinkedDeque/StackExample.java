package Deque.ConcurrentLinkedDeque;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StackExample {
    public static void main(String[] args) {

        ConcurrentLinkedDeque<String> stack =
                new ConcurrentLinkedDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}

