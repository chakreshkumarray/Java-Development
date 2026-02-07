package Deque.LinkedList;

import java.util.LinkedList;

public class BasicDeque {
    public static void main(String[] args) {

        LinkedList<Integer> deque = new LinkedList<>();
        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);
        System.out.println(deque.pollFirst());

    }
}
