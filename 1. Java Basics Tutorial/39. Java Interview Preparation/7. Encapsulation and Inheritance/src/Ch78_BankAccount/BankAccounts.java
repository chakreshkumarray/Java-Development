package Ch78_BankAccount;
public class BankAccounts {

    private String accountNumber;
    private String accountholder;
    private double balance;

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
