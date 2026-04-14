package Topic14_ExecutorFramework.Topic1_ExecutorMethod;
import java.util.concurrent.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class E4_ShutdownTerminated {
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
/*
🔹 1. shutdown()
👉 Used to gracefully stop an ExecutorService
executor.shutdown();
✔ What it does:
Stops accepting new tasks
Allows already submitted tasks to complete

🔹 2. awaitTermination()
👉 Used to wait for all tasks to finish
executor.awaitTermination(5, TimeUnit.SECONDS);
✔ What it does:
Waits for tasks to complete
Waits up to given time
Returns:
true → all tasks finished
false → timeout
 */