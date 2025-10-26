package Ch87;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        try {
            int divide = first / second;
            System.out.println("Answer is: " + divide);
        }catch (ArithmeticException e){
            if (e.getMessage().equals("/ by zero")){
                System.out.println("Divide by zero occurs");
            }else {
                throw e;
            }
        }


    }
}
