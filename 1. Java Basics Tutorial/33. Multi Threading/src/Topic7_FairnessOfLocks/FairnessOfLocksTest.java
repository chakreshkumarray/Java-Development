package Topic7_FairnessOfLocks;
public class FairnessOfLocksTest {
    public static void main(String[] args) {

        FairnessOfLocks fairnessOfLocks = new FairnessOfLocks();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                fairnessOfLocks.accessResource();
            }
        };

        Thread t1 = new Thread(task,"Thread 1");
        Thread t2 = new Thread(task,"Thread 2");
        Thread t3 = new Thread(task,"Thread 3");

        t1.start();
        t2.start();
        t3.start();
    }
}
