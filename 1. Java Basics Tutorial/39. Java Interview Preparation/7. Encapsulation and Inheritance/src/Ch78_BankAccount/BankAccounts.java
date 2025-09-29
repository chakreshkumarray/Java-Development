package Ch78_BankAccount;
public class BankAccounts {

    private String accountNumber;
    private String accountHolder;
    private double balance;

    BankAccounts(String accountNumber,String accountHolder,double balance){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void depositMoney(double money) {
        if (money <= 0) {
            System.out.println("Invalid deposit");
        } else{
            balance += money;
        }
    }

    public double withdrawMoney(double money){
        if (balance >= money){
            balance -= money;
        } else if (money <= 0) {
            System.out.println("Invalid withdraw");
        }else {
            money = balance;
            balance = 0;
        }
        return money;
    }
}
