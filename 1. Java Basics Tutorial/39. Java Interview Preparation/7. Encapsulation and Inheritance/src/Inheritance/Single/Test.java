package Inheritance.Single;
public class Test {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();

        TwoWheeler two = new TwoWheeler();

        MotorCycle motorCycle = new MotorCycle();

        vehicle.commute();
        two.commute();
        two.balance();
        motorCycle.start();

    }
}
