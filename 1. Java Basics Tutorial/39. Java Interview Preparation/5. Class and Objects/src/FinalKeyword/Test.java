package FinalKeyword;

public class Test {
    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();
        car.airBag();
        car.decelerate();

        EVCar evCar = new EVCar();
        evCar.accelerate();
        evCar.decelerate();
        evCar.airBag();
    }
}
