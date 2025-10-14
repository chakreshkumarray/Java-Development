package Abstraction;

public class Test {
    public static void main(String[] args) {

        /*
         * Vehicle vehicle = new Vehicle();
         *         not able to create object
         */

        Car vehicle = new Car();
        vehicle.accelerate();
        vehicle.Speed();
        vehicle.decelerate();

        Cycle cycle = new Cycle();
        cycle.accelerate();
        cycle.decelerate();

    }
}
