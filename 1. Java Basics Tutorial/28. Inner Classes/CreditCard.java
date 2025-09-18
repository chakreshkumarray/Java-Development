package Anonymous_InnerClass;

public class CreditCard implements Payment {

    private int CreditCardNumber;

    public CreditCard(int creditCardNumber) {
        this.CreditCardNumber = creditCardNumber;
    }

    @Override
    public void Pay(double amount) {
        System.out.println("Paid " + amount +" using credit Card..");
    }

}
