import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        System.out.println("are you female?(true/false)");
        boolean isFemale = input.nextBoolean();
        
        if (age<50){
            System.out.println("You got 75%");
        } else if (isFemale) {
            System.out.println("You got 58%");
        } else if (age>25 && !isFemale) {
            System.out.println("You got 25%");
        }else {
            System.out.println("You got no discount");
        }
    }
}
