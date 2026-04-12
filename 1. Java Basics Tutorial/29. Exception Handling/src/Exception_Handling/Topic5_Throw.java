package Exception_Handling;

public class Topic5_Throw {
    public static void main(String[] args) {

        int balance = 1000;
        int withdrawAmount = 1500;

        try {
            if (withdrawAmount > balance) {
                throw new Exception("Insufficient funds");
            }

            balance -= withdrawAmount;
            System.out.println("Withdrawal successful");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Transaction completed");
    }
}
