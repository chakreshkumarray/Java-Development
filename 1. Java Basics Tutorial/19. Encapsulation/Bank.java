public class Bank {

    private long accountNumber;
    private double balance;

    // Method / Functionality / Behaviour
    public void deposit(double amount){
        if(amount > 0){
            balance = balance + amount;
            System.out.println("Deposited: "+amount);
        }else {
            System.out.println("Invalid Deposit amount..");
        }
    }
    public void withdraw(double amount){
        if(amount > 0 && amount <= balance){
            balance = balance - amount;
            System.out.println("Withdraw: "+amount);
        }else {
            System.out.println("Invalid Amount and Insufficient balance..");
        }
    }
    // Setter Method
    public void setAccountNumber(long accountNumber){
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance){ // optional
        this.balance = balance;
    }

    // Getter Method
    public long getAccountNumber(){
        return accountNumber;
    }

    public double getBalance(){
        return balance;
    }
}

