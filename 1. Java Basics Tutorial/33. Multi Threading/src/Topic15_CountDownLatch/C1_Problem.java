package Topic15_CountDownLatch;
import java.util.concurrent.*;

public class C1_Problem {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

       ExecutorService executorService =  Executors.newFixedThreadPool(3);
       Future<String> future1 = executorService.submit(new C4_DependentServices(new CountDownLatch(8)));
       Future<String> future2 = executorService.submit(new C4_DependentServices(new CountDownLatch(7)));
       Future<String> future3 = executorService.submit(new C4_DependentServices(new CountDownLatch(4)));

       future1.get();
       future2.get();
       future3.get();

       System.out.println("Starting main service..");
       executorService.shutdown();
    }
}
/*
🔹 What is CountDownLatch?

👉 CountDownLatch is a synchronization aid that allows one or more threads to wait until a set of operations completes

🔹 Simple Idea

👉 You set a count
👉 Threads complete tasks and decrease the count
👉 When count becomes 0 → waiting thread continues
 */

