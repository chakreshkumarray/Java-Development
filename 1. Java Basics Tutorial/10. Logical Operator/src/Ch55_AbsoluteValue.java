package TernaryOperator;

import java.util.Scanner;

public class Ch55_AbsoluteValue {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        int result = num >= 0 ? num : -num;
        System.out.println("Absolute value is: "+result);
    }

}
