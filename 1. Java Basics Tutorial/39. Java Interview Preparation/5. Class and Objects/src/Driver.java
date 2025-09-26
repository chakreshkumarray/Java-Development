public class Driver {
    public static void main(String[] args) {

        Car myCar = new Car();
        myCar.noOfWheels = 4;
        myCar.color = "Red";
        myCar.currentFuelInLiters = 5;
        myCar.drive();
        myCar.addFuel(6);
        myCar.drive();
        myCar.drive();
        Car s = myCar.start();
        s.drive();

        // Constructor access
        Car car = new Car();
        System.out.println(car.color);
        System.out.println(car.noOfWheels);

        System.out.println(myCar.noOfWheels);
        System.out.println(myCar.color);
        System.out.println(myCar.getCurrentFuelLevel());
    }
}
