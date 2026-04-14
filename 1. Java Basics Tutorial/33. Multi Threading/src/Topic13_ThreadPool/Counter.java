package Topic13_ThreadPool;

public class Counter{

    int count = 0;

    public void increment() {
        count++;   // not thread-safe
    }

}
