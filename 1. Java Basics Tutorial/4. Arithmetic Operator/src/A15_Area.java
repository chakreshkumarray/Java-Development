import java.util.Scanner;

public class A15_Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Base: ");
        float base = input.nextFloat();
        System.out.print("Enter the height: ");
        float height = input.nextFloat();

        float Area =  (float) 1 / 2 * (base * height);

        System.out.println("Area of Triangle is: "+Area);
    }
}
