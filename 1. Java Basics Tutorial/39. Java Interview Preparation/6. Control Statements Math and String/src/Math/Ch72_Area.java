package Math;
import java.util.Scanner;
public class Ch72_Area {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double circumference = 2 * Math.PI * radius;
        double area          = Math.PI * Math.pow(radius,2);

        System.out.println("circumference of circle: "+circumference);
        System.out.println("area of circle: "+area);
    }
}
