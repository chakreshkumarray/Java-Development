import java.util.Scanner;

public class SwitchDeepDive {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number=input.nextInt();

        switch (number){
            case 1:
            case 2:
                break;
            case 3:
                System.out.println("ck...");
            case 4:
                System.out.println("number is 1,2,3,4");
            case 5:
                System.out.println("number is 2,4,8,10");
            case 6:
                System.out.println("Not number ");
                break;
            default:
                System.out.println("Invalid..");
                break;
        }
    }
}
