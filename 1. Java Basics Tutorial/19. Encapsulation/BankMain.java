public class BankMain {
    public static void main(String[] args) {

        Bank bank = new Bank(); // object of Bank.Bank class name bank
        bank.setAccountNumber(363581000);
        bank.setBalance(500);
        bank.deposit(100);
        bank.withdraw(20);
        bank.deposit(30);
        bank.withdraw(40);
        System.out.println(bank.getAccountNumber());
        System.out.println(bank.getBalance());
    }
}
