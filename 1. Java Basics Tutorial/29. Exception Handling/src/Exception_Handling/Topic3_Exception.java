package Exception_Handling;

import java.util.Scanner;

public class Topic3_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();  // if user enters text

            System.out.println("You entered: " + num);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a number.");

        } finally {
            sc.close();
            System.out.println("Program ended.");
        }
    }

}
