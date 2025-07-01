package Static_NestedClass;

public class Test {
    public static void main(String[] args) {

        Computer computer = new Computer("HP","Inspiration","Windows");
        computer.getOs().displayInfo();

        // Nested Class Access
        Computer.USB usb = new Computer.USB("Type-C");
        usb.displayInfo();

    }
}
