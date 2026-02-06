package Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Ecommerce {
    public static void main(String[] args) {

        Queue<OrderAdvance> queue = new LinkedList<>();

        queue.offer(new OrderAdvance(122));
        queue.offer(new OrderAdvance(123));
        queue.offer(new OrderAdvance(124));

        while (!queue.isEmpty()) {
            OrderAdvance orders = queue.poll();
            processPayment(orders);
            shipOrder(orders);
        }

    }

    static void processPayment(OrderAdvance orders) {
        System.out.println("Payment processed for order " + orders.id);
    }

    static void shipOrder(OrderAdvance orders) {
        System.out.println("Order shipped: " + orders.id);
    }
}
