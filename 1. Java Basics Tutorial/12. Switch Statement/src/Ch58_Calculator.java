
import java.util.Scanner;
public class Ch58_Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int first = input.nextInt();
        System.out.print("Enter a number: ");
        int second = input.nextInt();
        System.out.print("Enter operation: ");
        String operation = input.next();

        int result = switch (operation){
            case "+" -> first+second;
            case "-" -> first-second;
            case "*" -> first*second;
            case "/" -> first/second;
            case "%" -> first%second;
            default -> -1;
        };
        System.out.print("Operation result: "+result);
    }
}
