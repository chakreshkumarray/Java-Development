package Topic14_ExecutorsFramework.Topic1_ExecutorMethod;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class Submit {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<?> future = service.submit(() -> System.out.println("Hello"));
        future.get();
        service.shutdown();
        Future<String> submits = service.submit( () -> System.out.println("Hello"),"Success");
        submits.get();
        service.shutdown();


    }
}
