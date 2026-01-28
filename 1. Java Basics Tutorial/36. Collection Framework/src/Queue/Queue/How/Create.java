package Queue.Queue.How;
import java.util.LinkedList;
import java.util.Queue;

public class Create{
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(12);
        queue.add(45);

        System.out.println(queue);
    }
}
