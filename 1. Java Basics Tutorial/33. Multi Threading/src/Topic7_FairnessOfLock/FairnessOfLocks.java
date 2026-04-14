package Topic7_FairnessOfLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class FairnessOfLocks {

    private final Lock unfairLock = new ReentrantLock(true);

    public void accessResource(){
        unfairLock.lock();
        try {
            System.out.println(Thread.currentThread().getName()+" Acquire the lock");
            Thread.sleep(2000);
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }finally {
            unfairLock.unlock();
            System.out.println(Thread.currentThread().getName()+" Release the lock");
        }
    }

}
/*
🔹 What is Fairness in Lock?
    Fairness means: Threads get the lock in the order they requested it (FIFO)

    First thread that asks → first to get the lock
    No thread is skipped or starved

  🔹 How to Create Fair Lock?
      Using ReentrantLock: ReentrantLock lock = new ReentrantLock(true);

     true = fair lock
     false (default) = unfair lock

 */