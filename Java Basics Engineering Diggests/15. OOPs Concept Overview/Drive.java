public class Drive {
    public static void main(String[] args) {

        Car Car = new Car(); // object creation of Car_Class
        Car.color="Pink";
        Car.brand="Tata";
        Car.model="Safari";
        Car.year=2024;
        Car.speed=40;
        System.out.println(Car.color);
        System.out.println(Car.brand);
        System.out.println(Car.model);
        System.out.println(Car.year);
        System.out.println(Car.speed);
        
        Car.accelerate(1);
        System.out.println(Car.speed);
        Car.accelerate(5);
        System.out.println(Car.speed);

        Car.brake(46);
        System.out.println(Car.speed);

    }
}
