package WhileLoop;

import java.util.Scanner;

public class Ch29_SumOfOddNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int i = 1;
        int sum = 0;
        while (i <= num){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("Sum of Odd Number is: "+sum);
    }
}
