package Exceptions;
import java.util.Scanner;
public class ExceptionStack {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        try {
            int result = first / second;
            System.out.printf("Result %d: ", result);
        }catch (ArithmeticException exception){
            System.out.println("Divide by zero , enter valid value");
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array should under length");
        }catch (Throwable throwable){
            System.out.println("Manage all exception");
            throw throwable;
        }
    }
}
