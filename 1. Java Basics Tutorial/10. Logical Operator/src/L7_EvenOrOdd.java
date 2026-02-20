import java.util.Scanner;

public class L7_EvenOrOdd {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        String result = num % 2 == 0 ? "Even": "Odd";
        System.out.println("Number is "+result);
    }
}
