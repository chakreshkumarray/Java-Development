package Topic4_Anonymous_InnerClass;

public class Test {
    public static void main(String[] args) {

        Payment payment = new CreditCard(43646563);
        payment.Pay(16);

        ShoppingCart shoppingCart = new ShoppingCart(28);
        shoppingCart.processPayment(payment);

    }
}
