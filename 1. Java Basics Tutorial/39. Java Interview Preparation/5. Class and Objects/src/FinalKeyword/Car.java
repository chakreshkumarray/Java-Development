package FinalKeyword;

public class Car extends Vehicles{
    public final void airBag(){
        System.out.println(" 4 air bags");
    }

    public static final double PI;

    static {
        PI = 3.15499;
    }

    private final int speedLimit=200;

    // public Car{
    //   speedLimit = 300;
    //}

    //  public int getSpeedLimit() {
    //   return speedLimit;
    // }

    // public void setSpeedLimit(int speedLimit) {
    //   this.speedLimit = speedLimit;
    //}

    @Override
    public void accelerate(){
        System.out.println("Go fast");
    }

    @Override
    public void decelerate(){
        System.out.println("Slow");
    }
}
