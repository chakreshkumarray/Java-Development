import java.util.Scanner;

public class Ch35_ReverseDigits {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter Digits: ");
        int num = input.nextInt();

        int reverse = 0;
        while (num > 0){
            int digits = num % 10;
            reverse = reverse * 10 + digits;
            num = num / 10;
        }
        System.out.println("Reverse Digits is: "+reverse);
    }
}
