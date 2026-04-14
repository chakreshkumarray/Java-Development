package Topic16_CyclicBarrier;

import java.util.concurrent.*;

public class C1_CyclicBarrier {
    public static void main(String[] args) throws BrokenBarrierException, InterruptedException, TimeoutException {

        int numberServices = 3;
        ExecutorService services = Executors.newFixedThreadPool(numberServices);
        java.util.concurrent.CyclicBarrier barrier = new java.util.concurrent.CyclicBarrier(numberServices);
        services.submit(new C1_Dependent(barrier));
        services.submit(new C1_Dependent(barrier));
        services.submit(new C1_Dependent(barrier));
        barrier.await();
        barrier.await(5 , TimeUnit.SECONDS);

        System.out.println("Main");
        services.shutdown();
        barrier.reset();
        barrier.getParties();
        services.shutdownNow();
    }
}
/*
🔹 What is CyclicBarrier?
 CyclicBarrier is a synchronization tool
that allows a group of threads to wait for each other
until all reach a common point (barrier)

🔹 Simple Idea
You set a number (say 3 threads)
All 3 threads must reach the barrier
Only then → all proceed together

🔹 Why “Cyclic”?
 Because it is reusable
After all threads cross the barrier
 */


