package Topic14_ExecutorFramework.Topic2_Future;

import java.util.concurrent.*;

public class GetTime {
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(()-> {
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                System.out.println("Exception occurred " +e);
            }
            return 42;
        });

        Integer i =null;
        try {
            i = future.get(1,TimeUnit.SECONDS);
            System.out.println(future.isDone());
            System.out.println(i);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            System.out.println("Exception occurred "+ e);
        }
        executorService.shutdown();
    }
}
/*
🔹 What is get(time, unit)?

👉 It is a method of Future that:

Waits for result only for a limited time
Prevents infinite blocking
🔹 Syntax
future.get(long timeout, TimeUnit unit);
 */