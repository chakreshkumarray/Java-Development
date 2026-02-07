package Queue.PriorityBlockingQueue;

class Job implements Comparable<Job> {
    private final int jobId;
    private final int priority;
    private final int executionTime;

    public Job(int jobId, int priority, int executionTime) {
        this.jobId = jobId;
        this.priority = priority;
        this.executionTime = executionTime;
    }

    public int getExecutionTime() {
        return executionTime;
    }

    @Override
    public int compareTo(Job other) {
        // Higher priority first
        return other.priority - this.priority;
    }

    @Override
    public String toString() {
        return "Job-" + jobId + " [priority=" + priority + "]";
    }
}

