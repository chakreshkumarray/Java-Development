package Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class CallCenter {
    public static void main(String[] args) {

        Queue<Call> calls = new LinkedList<>();

        calls.offer(new Call("Customer-1"));
        calls.offer(new Call("Customer-2"));
        calls.offer(new Call("Customer-3"));


        for (Call i : calls) {
            System.out.println(i);
        }

        while (!calls.isEmpty()) {
            Call call = calls.poll();
            System.out.println("Handling call of: " + call.customerName);
        }
    }
}
