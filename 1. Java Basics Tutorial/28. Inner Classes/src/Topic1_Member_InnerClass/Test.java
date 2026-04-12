package Topic1_Member_InnerClass;

public class Test {
    public static void main(String[] args) {

        Car car = new Car("Tata");

        // create inner class object
        Car.Engine engine = car.new Engine();

        engine.start();
        engine.start();

        Engine1 engine1 = new Engine1(new Car("Thar"));
        engine1.start();
        engine1.start();
    }
}
/*
Member Inner Class

 */
