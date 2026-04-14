package Topic14_ExecutorFramework.Topic1_ExecutorMethod;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class E2_ExecutorsServices {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(5);
                                      // E1_Executor.newSingleThreadExecutor();
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
        executor.shutdownNow();
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
🔹 What is ExecutorService?
 ExecutorService is an interface (child of Executor) used to:
Manage a pool of threads
Execute tasks asynchronously
Control thread lifecycle

🔹 Why Use It?
Instead of creating threads manually:
new Thread().start(); ❌
 Use: executor.submit(task); ✅
 */
