package Abstraction;

public class Car extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Car Fast Go..");
    }

    @Override
    public void decelerate() {
        System.out.println("Car Slow speed..");
    }

    public void Speed(){
        System.out.println("Car Increase..");
    }

}
