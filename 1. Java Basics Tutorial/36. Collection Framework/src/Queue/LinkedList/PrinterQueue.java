package Queue.LinkedList;
import java.util.LinkedList;
import java.util.Queue;

public class PrinterQueue {
    public static void main(String[] args) {

        Queue<String> queue = new LinkedList<>();
        queue.offer("Resume.pdf");
        queue.offer("Invoice.docx");
        queue.offer("Report.xlsx");
        queue.offer("Customer.csv");

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println("Printing: " + queue.poll());
        }
    }
}
