package SingleInheritance;

public class Test {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.commute();

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute();

    }
}
