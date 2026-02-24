package Topic6_Locks.Topic1_Implicit;

public class TestNumber {
    public static void main(String[] args) {

        Number number = new Number();

        // Thread 1
        Thread t1 = new Thread(()->{
           for (int i = 1; i <= 100; i++){
               number.increment();
           }
        });

        // Thread 2
        Thread t2 = new Thread(()->{
            for (int i = 1; i <= 100; i++) {
                number.increment();
            }
        });

        // start both therads
        t1.start();
        t2.start();

        // wait for thread to finish
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("number: "+number.getCount());

    }
}
