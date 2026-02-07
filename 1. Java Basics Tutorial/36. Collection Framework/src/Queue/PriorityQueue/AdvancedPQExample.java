package Queue.PriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;

public class AdvancedPQExample {
    public static void main(String[] args) {

        Comparator<BugTicket> ticketSorter = Comparator
                .comparing(BugTicket::getSeverity)
                .thenComparing(
                        BugTicket::getDaysPending,
                        Comparator.reverseOrder()
                );

        PriorityQueue<BugTicket> supportQueue = new PriorityQueue<>(ticketSorter);

        supportQueue.add(new BugTicket("BUG-001", Severity.LOW, 5));
        supportQueue.add(new BugTicket("BUG-002", Severity.CRITICAL, 2));
        supportQueue.add(new BugTicket("BUG-003", Severity.HIGH, 10));
        supportQueue.add(new BugTicket("BUG-004", Severity.CRITICAL, 15));
        supportQueue.add(new BugTicket("BUG-005", Severity.HIGH, 1));

        System.out.println("--- Processing Tickets in Priority Order ---");

        while (!supportQueue.isEmpty()) {
            // poll() removes the head (highest priority)
            System.out.println("Fixing: " + supportQueue.poll());
        }
    }
}
