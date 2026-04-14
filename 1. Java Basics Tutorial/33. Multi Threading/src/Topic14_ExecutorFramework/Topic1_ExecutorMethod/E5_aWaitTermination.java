package Topic14_ExecutorFramework.Topic1_ExecutorMethod;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class E5_aWaitTermination {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> {
            System.out.println(factorial(4));
            try {
                Thread.sleep(1000);
                System.out.println(factorial(4));
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        });
        executor.shutdown();
        try {
            executor.awaitTermination(100, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println(Thread.currentThread().getName());
    }

    public static long factorial(int n){
        int result = 1;
        for (int i = 1; i <= n; i++){
            result = result * i;
        }
        return result ;
    }
}
/*
🔹 What is awaitTermination()?
awaitTermination() is used with ExecutorService to wait for all threads to finish execution after shutdown.

🔹 Why is it Needed?
When you use thread pools: executor.shutdown();

This only stops accepting new tasks, but: Existing tasks may still be running ❗

So we use: awaitTermination()
 */