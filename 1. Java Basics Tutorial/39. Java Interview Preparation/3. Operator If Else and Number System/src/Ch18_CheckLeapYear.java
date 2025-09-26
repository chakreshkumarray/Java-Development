import java.util.Scanner;

public class Ch18_CheckLeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter year: ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 == 1)){
            System.out.println("This is Leap Year");
        }else {
            System.out.println("Not Leap Year");
        }
    }
}
