package Topic6_Locks.Topic2_Explicit;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locking {
    private  int balance = 100;
    private final Lock lock = new ReentrantLock();// Object of lock method

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting to Withdrawal amount "+ amount);
        try {
            //lock.lock();
            if (lock.tryLock(1000, TimeUnit.MILLISECONDS)){
                if (balance >= amount){
                    try {
                        System.out.println(Thread.currentThread().getName()+" Proceeding withdrawal ");
                        Thread.sleep(3000);
                        balance = balance - amount;
                        System.out.println(Thread.currentThread().getName() +" Completed Withdrawal " + balance);
                    } catch (Exception e) {
                        Thread.currentThread().interrupt();
                    }finally {
                        lock.unlock();
                    }
                }else {
                    System.out.println(Thread.currentThread().getName()+" Insufficient balance ");
                }
            }else {
                System.out.println(Thread.currentThread().getName() + " Couldn't acquire the lock ..! Try later ");
            }
        }catch (Exception e){
            Thread.currentThread().interrupt();
        }

    }
}
