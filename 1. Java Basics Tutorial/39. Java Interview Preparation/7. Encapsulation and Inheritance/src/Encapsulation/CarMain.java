package Encapsulation;
public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.color = "Black";
        car.model = "Safari";
        car.wheel = 4;
        car.price = 2587999;
        car.fuelLevel = 4.5;
        System.out.println(car.color);
        System.out.println(car.model);
        System.out.println(car.wheel);
        System.out.println(car.price);
        System.out.println(car.fuelLevel);

    }
}