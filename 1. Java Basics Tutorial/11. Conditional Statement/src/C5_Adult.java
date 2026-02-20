import java.util.Scanner;

public class C5_Adult {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age  = input.nextInt();
        if(age >= 18){
            System.out.println("You are Adult !");
        }else {
            System.out.println("No Adult");
        }

    }
}
