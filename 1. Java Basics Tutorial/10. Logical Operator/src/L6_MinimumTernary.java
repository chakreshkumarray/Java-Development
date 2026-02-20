import java.util.Scanner;

public class L6_MinimumTernary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first = input.nextInt();
        System.out.print("Enter a number: ");
        int second = input.nextInt();

        int minimum = first < second ? first : second;
        System.out.println("Minimum number is: "+minimum);
    }
}