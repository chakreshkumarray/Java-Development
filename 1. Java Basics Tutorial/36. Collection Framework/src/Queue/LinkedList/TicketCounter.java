package Queue.LinkedList;
import java.util.LinkedList;
import java.util.Queue;

public class TicketCounter {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Chakresh");
        queue.offer("Ambreesh");
        queue.offer("Dheeraj");
        queue.offer("Shivam");

        for (String i : queue){
            System.out.println(i);
        }

        while (!queue.isEmpty()) {
            System.out.println("Serving: " + queue.poll());
        }
    }

}
