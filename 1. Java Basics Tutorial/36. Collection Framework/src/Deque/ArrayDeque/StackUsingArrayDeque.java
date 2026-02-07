package Deque.ArrayDeque;

import java.util.ArrayDeque;

public class StackUsingArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<String> stack = new ArrayDeque<>();

        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println(stack.pop()); // C
        System.out.println(stack.pop()); // B
        System.out.println(stack.pop()); // A
    }
}

