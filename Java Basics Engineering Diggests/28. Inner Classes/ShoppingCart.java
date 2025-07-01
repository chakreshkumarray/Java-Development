package Anonymous_InnerClass;

public class ShoppingCart {

    private final double totalAmount;

    public ShoppingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void processPayment(Payment paymentMethod){
        paymentMethod.Pay(totalAmount);
    }

}
