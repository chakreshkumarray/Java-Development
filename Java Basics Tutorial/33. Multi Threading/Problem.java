package Executors_Framework_14.CountDownLatch;
import java.util.concurrent.*;

public class Problem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       ExecutorService executorService =  Executors.newFixedThreadPool(3);
       Future<String> future1 = executorService.submit(new DependentServices(new CountDownLatch(8)));
       Future<String> future2 = executorService.submit(new DependentServices(new CountDownLatch(7)));
       Future<String> future3 = executorService.submit(new DependentServices(new CountDownLatch(4)));

       future1.get();
       future2.get();
       future3.get();

       System.out.println("Starting main service..");
       executorService.shutdown();
    }
}


