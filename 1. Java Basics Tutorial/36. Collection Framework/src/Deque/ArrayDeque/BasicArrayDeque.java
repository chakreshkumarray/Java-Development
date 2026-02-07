package Deque.ArrayDeque;

import java.util.ArrayDeque;

public class BasicArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.offerFirst(12);
        ad.add(13);
        ad.add(36);
        ad.addLast(45);

        System.out.println(ad);
        System.out.println(ad.poll());
    }
}
