package Queue.PriorityBlockingQueue;

class Task implements Comparable<Task> {
    int priority;
    String name;

    Task(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }

    @Override
    public int compareTo(Task t) {
        return this.priority - t.priority;
    }

}
