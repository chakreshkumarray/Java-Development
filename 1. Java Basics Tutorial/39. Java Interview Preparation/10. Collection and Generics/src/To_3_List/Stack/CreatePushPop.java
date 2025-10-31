package To_3_List.Stack;

import java.util.Stack;

public class CreatePushPop {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        // Push
        stack.push(12);
        stack.push(32);
        stack.push(55);
        stack.push(20);
        stack.push(63);
        System.out.println(stack);
        // Pop
        stack.pop();
        System.out.println(stack);
    }
}
