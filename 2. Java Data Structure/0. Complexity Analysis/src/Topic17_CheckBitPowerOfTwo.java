import java.util.Scanner;

public class Topic17_CheckBitPowerOfTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(num & (num-1));
    }
}
