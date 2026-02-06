package Queue.LinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class Restaurant {
    public static void main(String[] args) {

        Queue<Order> orders = new LinkedList<>();

        orders.offer(new Order(101));
        orders.offer(new Order(102));
        orders.offer(new Order(103));

        while (!orders.isEmpty()) {
            System.out.println("Preparing order: " + orders.poll().OrderId);
        }

    }
}
