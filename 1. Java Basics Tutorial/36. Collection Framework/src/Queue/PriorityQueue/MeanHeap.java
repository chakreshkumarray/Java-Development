package Queue.PriorityQueue;
import java.util.PriorityQueue;

public class MeanHeap {
    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(30);
        pq.add(5);

        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}
