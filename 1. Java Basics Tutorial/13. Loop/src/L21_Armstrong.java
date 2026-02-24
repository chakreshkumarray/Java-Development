import java.util.Scanner;
public class L21_Armstrong {
    public static void main(String[] args) {

        // output & input: 0,1,153,370,371,407,1634............
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int original = num;
        int result = 0;

        while (num != 0) {
            int digit = num % 10;
            result = result + digit * digit * digit;
            num = num / 10;
        }

        if (result == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }
    }

}
