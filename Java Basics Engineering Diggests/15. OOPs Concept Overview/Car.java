public class Car {

    // Declaration of class
    String color;
    String brand;
    String model;
    int year;
    int speed;

    public void accelerate(int increment){
        speed = speed+increment;
        System.out.println("Car is Running");
    }

    public void brake(int decrement){
        speed = speed-decrement;
        if(speed<=0){
            speed=0;
            System.out.println("break");
        }else {
            System.out.println("Slow");
        }
    }

}
