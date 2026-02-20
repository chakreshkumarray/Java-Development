import java.util.Scanner;

public class A12_TakeTwoNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println("Sum of number: "+sum);
        System.out.println("Sub of number: "+sub);
        System.out.println("Mul of number: "+mul);
        System.out.println("Div of number: "+div);
        System.out.println("Mod of number: "+mod);
    }
}
