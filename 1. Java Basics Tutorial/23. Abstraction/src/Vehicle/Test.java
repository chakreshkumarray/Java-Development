package Vehicle;

public class Test {
    public static void main(String[] args) {

        Vehicle vehicle = new Car();


        Car car = new Car();
        car.accelerate();
        car.Speed();
        car.decelerate();

        Cycle cycle = new Cycle();
        cycle.accelerate();
        cycle.decelerate();

    }
}
