package Topic8_ReadWriteLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
public class ReadeWriteCounter {

    private int count = 0;

    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private final Lock readLock = lock.readLock();
    private final Lock writeLock = lock.writeLock();

    public void increment(){
        writeLock.lock();
        try {
            count++;
            try {
                Thread.sleep(50);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }finally {
            writeLock.unlock();
        }
    }

    public int getCount(){
        readLock.lock();
        try {
            return count;
        }finally {
            readLock.unlock();
        }
    }

}
/*
🔹 What is ReadWriteLock?
    ReadWriteLock is an interface in java.util.concurrent.locks

   It provides two types of locks:
   Read Lock → for reading data
   Write Lock → for modifying data

🔹 Why Use It?
   C1_Problem with normal lock (ReentrantLock): Only one thread can access at a time ❌

   Solution with ReadWriteLock:
    Multiple readers allowed simultaneously
    Only one writer allowed
    Writer gets exclusive access

🔹 Implementation Class
   ReentrantReadWriteLock
 */