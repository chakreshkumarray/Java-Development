package Executors_Framework_14.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class IsCancelled {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorServices = Executors.newSingleThreadExecutor();
        Future<Integer> futures = executorServices.submit(()-> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Exception occurred " +e);
            }
            System.out.println("ck");
            return 42;
        });
        Thread.sleep(2000);
        futures.cancel(false);
        System.out.println(futures.isCancelled());
        System.out.println(futures.isDone());
        executorServices.shutdown();
    }
}
