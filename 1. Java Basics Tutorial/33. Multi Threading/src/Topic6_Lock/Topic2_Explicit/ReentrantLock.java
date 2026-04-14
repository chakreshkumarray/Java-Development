package Topic6_Lock.Topic2_Explicit;
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
/*
🔹 1. What is Lock?
    Lock is an interface in java.util.concurrent.locks
     It defines methods for locking:
     lock()
     unlock()
     tryLock()

🔹 2. What is ReentrantLock?
      ReentrantLock is a class that implements Lock
      It provides actual implementation + extra features

 */


