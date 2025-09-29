package Constructor;
public class BusMain {
    public static void main(String[] args) {

        Bus bus = new Bus("RED", "TATA", 4, 70, 9800000);
        System.out.println(bus.getColor());
        System.out.println(bus.getFuelLevel());
        System.out.println(bus.getModel());
        System.out.println(bus.getWheel());
        System.out.println(bus.getPrice());

    }
}
