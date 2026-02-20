package WhileLoop;

import java.util.Scanner;
public class Ch38_NumberPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int original = num;
        int rev = 0;

        while(num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        if(original == rev) {
            System.out.println(original + " is a palindrome.");
        }
        else{
            System.out.println(original + " is not a palindrome.");
        }


    }
}
