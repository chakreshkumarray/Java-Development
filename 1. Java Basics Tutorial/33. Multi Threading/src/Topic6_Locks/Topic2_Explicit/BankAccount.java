package Topic6_Locks.Topic2_Explicit;

public class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount){
        System.out.println(Thread.currentThread().getName() + " Attempting to withdraw " + amount);

        if (balance >= amount){
            System.out.println(Thread.currentThread().getName() + " Proceeding with withdrawal ");
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
            balance = balance - amount;
            System.out.println(Thread.currentThread().getName() +" Completed withdrawal ." +
                    " Remaining balance is " + balance);
        }else {
            System.out.println(Thread.currentThread().getName() + " Insufficient Balance ");
        }
    }
}
