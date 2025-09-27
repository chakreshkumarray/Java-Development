package Custom_Exceptions;

public class BankAccount {

    private double balance;

    public BankAccount(double amount){
        this.balance = amount;
    }
    public void Withdraw(double amount) throws Exception{
        if (amount > balance){
            throw  new LowBalance();
        }
        balance = balance-amount;
    }

}
