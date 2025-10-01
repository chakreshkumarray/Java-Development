package Topic14_ExecutorsFramework.Topic1_ExecutorMethod;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ShutdownTerminated {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Future<Integer>submit = executorService.submit(() -> 1 + 2);
        Integer i = submit.get();
        System.out.println("Sum is "+i);
        executorService.shutdown();
        System.out.println(executorService.isShutdown());
        Thread.sleep(1000);
        System.out.println(executorService.isTerminated());


    }
}
