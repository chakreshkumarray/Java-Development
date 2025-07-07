package LOCKS_6.Explicit_2;

public class LockingTest {
    public static void main(String[] args) {

        Locking sbi = new Locking();

        Runnable task = () -> sbi.withdraw(26);
        /* OR
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };*/

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        t1.start();
        t2.start();



    }
}
