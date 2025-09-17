package LOCKS_6.Explicit_2;

public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount sbi = new BankAccount();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(21);
            }
        };
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();
    }
}
