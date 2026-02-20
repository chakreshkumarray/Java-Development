import java.util.Scanner;

public class A18_Temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Fahrenheit: ");
        float Fahrenheit = input.nextFloat();

        float Celsius = ((Fahrenheit - 32) * 5 / 9);

        System.out.println("Temperature in Celsius: "+Celsius);
    }
}
