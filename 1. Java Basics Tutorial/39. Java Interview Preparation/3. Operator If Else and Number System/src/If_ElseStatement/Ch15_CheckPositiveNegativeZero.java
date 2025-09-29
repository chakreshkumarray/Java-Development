package If_ElseStatement;

import java.util.Scanner;

public class Ch15_CheckPositiveNegativeZero {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0){
            System.out.println("Number is Positive");
        }else if (num < 0){
            System.out.println("Number is Negative");
        }else {
            System.out.println("Number is Zero");
        }

    }
}
