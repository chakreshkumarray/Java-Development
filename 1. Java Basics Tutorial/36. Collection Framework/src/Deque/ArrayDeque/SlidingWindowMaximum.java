package Deque.ArrayDeque;
import java.util.ArrayDeque;

public class SlidingWindowMaximum {
    public static void main(String[] args) {

        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        ArrayDeque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < arr.length; i++) {

            if (!deque.isEmpty() && deque.peekFirst() <= i - k) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() &&
                    arr[deque.peekLast()] < arr[i]) {
                deque.pollLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {
                System.out.print(arr[deque.peekFirst()] + " ");
            }
        }
    }
}
