package Queue.PriorityQueue;

public class BugTicket {

    private final String id;
    private final Severity severity;
    private final int daysPending;

    public BugTicket(String id, Severity severity, int daysPending) {
        this.id = id;
        this.severity = severity;
        this.daysPending = daysPending;
    }

    public String getId() {
        return id;
    }
    public Severity getSeverity() {
        return severity;
    }
    public int getDaysPending() {
        return daysPending;
    }

    @Override
    public String toString() {
        return "{" + id + " | " + severity + " | Pending: " + daysPending + " days}";
    }
}
