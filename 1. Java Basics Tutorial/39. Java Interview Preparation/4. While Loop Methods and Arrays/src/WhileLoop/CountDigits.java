package WhileLoop;

import java.util.Scanner;
public class CountDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        int num = input.nextInt();

        int digits = 0;
        while (num > 0){
            num = num / 10;
            digits++;
        }
        System.out.println("Digits are: "+digits);
    }
}
