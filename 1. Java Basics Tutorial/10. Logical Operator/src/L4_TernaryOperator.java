import java.util.Scanner;

public class L4_TernaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = input.nextInt();
        System.out.println("Enter a number: ");
        int num2 = input.nextInt();

        int greatest = num1 > num2 ? num1 : num2;
        System.out.println(greatest+": greatest number");
    }
}