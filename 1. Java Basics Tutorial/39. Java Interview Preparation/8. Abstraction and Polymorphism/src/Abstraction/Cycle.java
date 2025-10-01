package Abstraction;

public class Cycle extends Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Cycle running");
    }

    @Override
    public void decelerate() {
        System.out.println("Cycle is running");
    }

}
