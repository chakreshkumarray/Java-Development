package Topic14_ExecutorsFramework.Topic2_Future;
import java.util.concurrent.*;

public class Futures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<Integer> future = executor.submit(()-> 66);
        future.isDone();
        System.out.println(future.get());
        executor.shutdown();

        //  Callable method
        try {
            Callable<String> callable = () -> "Hello Ck";
            Future<String> subject = executor.submit(callable);
            System.out.println(subject.get());
            executor.shutdown();

        }catch (RejectedExecutionException e){
            System.out.println(e);
        }

        // ?
        try {
            Future<?> future1 = executor.submit(() -> System.out.println("Hello"));
            System.out.println("Task is Done !");
            System.out.println(future1.get());
            executor.shutdown();

        }catch (RejectedExecutionException e){
            System.out.println(e);
        }



    }

}
