import java.util.Scanner;

public class Ch20_Citizen {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = input.nextInt();
        
        if (age >= 65){
            System.out.println("Senior");
        } else if (age >= 20) {
            System.out.println("Adult");
        } else if (age >= 13) {
            System.out.println("Teen");
        }else {
            System.out.println("child");
        }

    }
}
