package Ch78_BankAccount;
public class Customer {
    public static void main(String[] args) {

        BankAccounts account = new BankAccounts("5503","CK",500);

        account.withdrawMoney(100);
        System.out.println(account.getBalance());
        account.depositMoney(200);
        System.out.println(account.getBalance());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAccountHolder());

    }
}
