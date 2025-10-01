package Topic6_Locks.Topic2_Explicit;
import java.util.concurrent.locks.Lock;

public class ReentrantLock {
    public static void main(String[] args) {
        ReentrantLock task = new ReentrantLock();
        task.outerMethod();

    }

    // Objet of Lock
    private final Lock lock = new java.util.concurrent.locks.ReentrantLock();

    public void outerMethod(){
        lock.lock();
        try {
            System.out.println(" Outer Method ");
            innerMethod();
        }finally {
            lock.unlock();
        }
    }

    public void innerMethod(){
        lock.lock();
        try {
            System.out.println(" Inner Method ");
            outerMethod();
        }catch (StackOverflowError error){
            System.out.println("error");
        }
        finally {
            lock.unlock();

        }

    }
}



