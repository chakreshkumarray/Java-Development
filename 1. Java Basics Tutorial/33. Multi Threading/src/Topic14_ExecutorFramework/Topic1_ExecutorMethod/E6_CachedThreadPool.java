package Topic14_ExecutorFramework.Topic1_ExecutorMethod;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E6_CachedThreadPool {
    public static void main(String[] args){

                                   Executors.newFixedThreadPool(2);
        ExecutorService services = Executors.newCachedThreadPool();
    }
}
/*
🔹 What is Cached Thread Pool?
  A Cached Thread Pool is a type of thread pool that:

Creates new threads as needed
Reuses previously created threads
Removes idle threads automatically
🔹 How to Create?
ExecutorService executor = Executors.newCachedThreadPool()
 */