package ClassAndObject;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.company = "Tata";
        car.Model = "Safari";
        car.color = "Black";
        car.manufacturingYear = 2024;

        System.out.println(car.company);
        System.out.println(car.Model);
        System.out.println(car.manufacturingYear);
        System.out.println(car.color);
    }
}
