package Deque.ArrayDeque;

import java.util.ArrayDeque;

public class PalindromeCheck {
    public static void main(String[] args) {

        String word = "madam";
        ArrayDeque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (!deque.pollFirst().equals(deque.pollLast())) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Palindrome: " + isPalindrome);
    }
}

