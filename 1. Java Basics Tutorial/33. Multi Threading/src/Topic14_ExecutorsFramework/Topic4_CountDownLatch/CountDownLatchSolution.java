package Topic14_ExecutorsFramework.Topic4_CountDownLatch;
import java.util.concurrent.*;

public class CountDownLatchSolution {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        ExecutorService executorServices =  Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorServices.submit(new DependentServices(latch));
        executorServices.submit(new DependentServices(latch));
        executorServices.submit(new DependentServices(latch));
        latch.await();
        latch.await(5 , TimeUnit.SECONDS);

        System.out.println("Main");
        executorServices.shutdown();

    }
}


