package Queue.BlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class AdvancedScheduler {
    public static void main(String[] args) {

        BlockingQueue<PrintJob> jobQueue = new PriorityBlockingQueue<>();

        new Thread(() -> {
            try {
                System.out.println("User A submits Regular job...");
                jobQueue.put(new PrintJob("Recipe.pdf", 3));

                System.out.println("User B submits Important Memo...");
                jobQueue.put(new PrintJob("Memo.docx", 2));

                Thread.sleep(100);

                System.out.println("CEO submits URGENT Contract...");
                jobQueue.put(new PrintJob("Contract_FINAL.pdf", 1));

            } catch (InterruptedException e) { e.printStackTrace(); }
        }).start();

        new Thread(() -> {
            try {
                Thread.sleep(1000);

                System.out.println("\n--- Printer Started ---");
                while (true) {
                    // jobQueue.take();
                    PrintJob job = jobQueue.take();
                    System.out.println("Printing: " + job);
                }
            } catch (InterruptedException e) { e.printStackTrace(); }
        }).start();

    }
}
