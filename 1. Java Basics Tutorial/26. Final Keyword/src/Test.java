public class Test {
    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();

        Cycle cycle = new Cycle();
        cycle.accelerate();
        cycle.decelerate();

        /*
        Cycle --> Vehicle
        Car --> Vehicle
        EVCar --> Car
         */
    }
}