package Queue.Queue.PriorityQueue;
import java.util.PriorityQueue;

public class Demo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.remove());
        System.out.println(pq.peek());

        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }
    }
}
