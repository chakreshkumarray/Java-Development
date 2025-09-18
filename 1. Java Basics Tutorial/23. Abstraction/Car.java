package Vehicles;

public class Car extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Fast Go..");
    }

    @Override
    public void decelerate() {
        System.out.println("Slow speed..");
    }

    public void Speed(){
        System.out.println("Increase..");
    }
    
}
