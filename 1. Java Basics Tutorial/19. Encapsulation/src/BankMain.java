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
/*
Q. What is Encapsulation (Deep Understanding) ?
Ans. Encapsulation = Binding data (variables) + methods (functions) into a single unit (class) AND
     controlling access to that data.

     It is also called Data Hiding

     Encapsulation is NOT just getters/setters.
      It is about:
      Protecting data
      Controlling how data is accessed/modified
      Maintaining object integrity

Q. Why Encapsulation?
Ans. Data Security -> Prevent direct access
     Data Validation ->
     Flexibility -> You can change internal logic without affecting users
     Maintainability -> Clean and structured code

Q. Encapsulation Rules (Important)
Ans.  Make variables private
      Provide public getter/setter methods
      Add validation logic inside methods


 */