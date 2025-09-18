package Executors_Framework_14.ExecutorMethod;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class aWaitTermination {
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
        for (int i = 1; i<=n; i++){
            result = result * i;
        }
        return result ;
    }

}
