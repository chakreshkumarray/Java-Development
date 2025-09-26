package AceesModifier;

public class CarMain {
    public static void main(String[] args) {

        Car car = new Car();
        car.color = "red";
        car.model = "JXTATA";

        Car myCar = new Car("Red","TATA",4555,450052);
        System.out.println(myCar.color);
        System.out.println(myCar.toString());
        System.out.println(myCar.model);
        System.out.println();
    }
}
