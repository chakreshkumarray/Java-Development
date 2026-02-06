package Queue.LinkedList;
import java.util.ArrayDeque;
import java.util.Queue;

public class WebServer {
    public static void main(String[] args) {

        Queue<Request> requestQueue = new ArrayDeque<>();

        requestQueue.offer(new Request("/login"));
        requestQueue.offer(new Request("/payment"));
        requestQueue.offer(new Request("/orders"));

        while (!requestQueue.isEmpty()) {
            Request req = requestQueue.poll();
            System.out.println("Processing request: " + req.url);
        }


    }
}
