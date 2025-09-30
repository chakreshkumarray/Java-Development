package ReadWriteLocking_8;
public class Test{
    public static void main(String[] args) {

        ReadeWriteCounter counter = new ReadeWriteCounter();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++){
                    System.out.println(Thread.currentThread().getName() +" read " + counter.getCount());
                }
            }
        };
        Runnable writeTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " incremented");
                }
            }
        };
        Thread t1 = new Thread(writeTask);
        Thread t2 = new Thread(readTask);
        Thread t3 = new Thread(readTask);

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

    }
}
