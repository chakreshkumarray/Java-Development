package Topic14_ExecutorFramework.Topic2_Future;
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
/*
🔹 What is get(time, unit)?
 It is a method of Future that:
Waits for result only for a limited time
Prevents infinite blocking

🔹 Syntax
future.get(long timeout, TimeUnit unit);
 */