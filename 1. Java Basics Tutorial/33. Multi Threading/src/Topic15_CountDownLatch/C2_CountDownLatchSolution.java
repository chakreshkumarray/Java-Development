package Topic15_CountDownLatch;
import java.util.concurrent.*;

public class C2_CountDownLatchSolution {
    public static void main(String[] args) throws InterruptedException {
        int numberOfServices = 3;
        ExecutorService executorServices =  Executors.newFixedThreadPool(numberOfServices);
        CountDownLatch latch = new CountDownLatch(numberOfServices);
        executorServices.submit(new C4_DependentServices(latch));
        executorServices.submit(new C4_DependentServices(latch));
        executorServices.submit(new C4_DependentServices(latch));
        latch.await();
        latch.await(5 , TimeUnit.SECONDS);

        System.out.println("Main");
        executorServices.shutdown();

    }
}


