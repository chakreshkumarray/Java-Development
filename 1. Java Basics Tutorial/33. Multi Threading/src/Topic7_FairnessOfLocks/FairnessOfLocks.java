package Topic7_FairnessOfLocks;
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
