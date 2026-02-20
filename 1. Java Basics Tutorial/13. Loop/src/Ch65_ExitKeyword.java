package BreakAndContinue;
import java.util.Scanner;
public class Ch65_ExitKeyword {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter your command: ");
            String command = input.next();
            if (command.equals("exit")){
                break;
            }
        }
        System.out.println("Successfully entered command");
    }
}
