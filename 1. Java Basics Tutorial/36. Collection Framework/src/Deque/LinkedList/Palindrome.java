package Deque.LinkedList;
import java.util.LinkedList;

public class Palindrome {
    public static void main(String[] args) {

        String s = "level";
        LinkedList<Character> deque = new LinkedList<>();

        for (char c : s.toCharArray())
            deque.addLast(c);

        boolean ok = true;
        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                ok = false;
                break;
            }
        }
        System.out.println(ok);
    }
}
