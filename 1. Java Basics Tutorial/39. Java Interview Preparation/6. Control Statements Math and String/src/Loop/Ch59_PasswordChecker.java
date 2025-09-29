package Loop;

import java.util.Scanner;

public class Ch59_PasswordChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String password;
        do {
            System.out.print("Please enter password: ");
            password = input.next();
        }while (!isValidPassword(password));
        System.out.println("Thanks for correct password");
    }

    public static boolean isValidPassword(String password){
        return password.length() > 6;

    }
}
