package Queue.LinkedList;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Producer
        for (int i = 1; i <= 5; i++) {
            queue.offer(i);
            System.out.println("Produced: " + i);
        }

        // Consumer
        while (!queue.isEmpty()) {
            System.out.println("Consumed: " + queue.poll());
        }

    }
}
