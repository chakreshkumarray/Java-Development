package FinalKeyword;

public class Cycle extends Vehicles{
    @Override
    public void accelerate() {
        System.out.println("cycle run");
    }

    @Override
    public void decelerate() {
        System.out.println("cycle slow");
    }
}
