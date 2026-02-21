import java.util.Scanner;

public class L25_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 5,guess;
        do {
            System.out.print("Enter number between 0 to 10: ");
            guess = input.nextInt();
        }while (num != guess);
        System.out.println("Successfully guessed the number");
    }
}
