package Queue.BlockingQueue;

public class PrintJob implements Comparable<PrintJob>{

    private String documentName;
    private int priority; // 1 = High/VIP, 2 = Medium, 3 = Low

    public PrintJob(String name, int priority) {
        this.documentName = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(PrintJob other) {
        // Ascending order: 1 comes before 2
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return "[Priority " + priority + "] " + documentName;
    }
}
