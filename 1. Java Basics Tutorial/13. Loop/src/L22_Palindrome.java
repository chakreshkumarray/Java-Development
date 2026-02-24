import java.util.Scanner;
public class L22_Palindrome {
    public static void main(String[] args) {

        // input: 12321
        // output: 12321
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int temp = num;
        int reverse = 0;
        int remender = 0;

        while(temp != 0) {
            remender = temp % 10;
            reverse = reverse * 10 + remender;
            temp = temp / 10;
        }

        if(num == reverse) {
            System.out.println(num + " is a palindrome.");
        }
        else{
            System.out.println(num + " is not a palindrome.");
        }


    }
}
