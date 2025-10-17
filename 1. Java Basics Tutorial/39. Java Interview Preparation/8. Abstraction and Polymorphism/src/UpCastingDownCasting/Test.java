package UpCastingDownCasting;

public class Test {
    public static void main(String[] args) {

        Car car = new Car();
        Vehicle vehicle = new Vehicle();

       // Car car1 = (Car)new Vehicle(); // Down Casting --> child to parent
        Vehicle vehicle1 = new Car();  // Up Casting --> parent to child

        Plane plane = new Plane();

        car.noOfDoors();
        vehicle1.start();

    }
}
