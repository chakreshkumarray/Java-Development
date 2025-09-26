import java.util.Scanner;
public class Ch37_ArmstrongNumber {
    public static void main(String[] args) {

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
