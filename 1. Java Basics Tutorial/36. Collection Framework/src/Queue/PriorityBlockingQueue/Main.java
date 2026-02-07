package Queue.PriorityBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class Main {
    public static void main(String[] args) {

        PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();

        // Producer
        new Thread(() -> {
            queue.add(new Task(3, "Low Priority"));
            queue.add(new Task(1, "High Priority"));
            queue.add(new Task(2, "Medium Priority"));
        }).start();

        // Consumer
        new Thread(() -> {
            try {
                while (true) {
                    Task task = queue.take(); // BLOCKS if empty
                    System.out.println(task.name);
                }
            } catch (InterruptedException e) {}
        }).start();
    }
}
