package Executors_Framework_14.CyclicBarrier;

import java.util.concurrent.*;

public class CyclicBarrier {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException, TimeoutException {

        int numberServices = 3;
        ExecutorService services = Executors.newFixedThreadPool(numberServices);
        java.util.concurrent.CyclicBarrier barrier = new java.util.concurrent.CyclicBarrier(numberServices);
        services.submit(new Dependent(barrier));
        services.submit(new Dependent(barrier));
        services.submit(new Dependent(barrier));
        barrier.await();
        barrier.await(5 , TimeUnit.SECONDS);

        System.out.println("Main");
        services.shutdown();
        barrier.reset();
        barrier.getParties();
        services.shutdownNow();
    }
}


