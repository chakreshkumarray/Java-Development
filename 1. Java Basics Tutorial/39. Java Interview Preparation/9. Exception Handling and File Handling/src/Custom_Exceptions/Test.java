package Custom_Exceptions;

public class Test {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(450);

        try {
            bankAccount.Withdraw(600);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
