package CustomExceptions;

public class Test {
    public static void main(String[] args) {

        Temperature temperature = new Temperature(40);
        System.out.println(temperature.getDegrees());
        System.out.println(temperature.getMessage());
    }
}
