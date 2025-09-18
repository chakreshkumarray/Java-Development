import java.util.Scanner;

public class SwitchOnString {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the String in Fruits Name: ");
        String  Fruits=input.nextLine();

        switch (Fruits){
            case "Apple":
                System.out.println("its a apple");
                break;
            case "Mango":
                System.out.println("its a Mango");
                break;
            case "Banana":
                System.out.println("its a Banana");
                break;
            case "Orange":
                System.out.println("its a Orange");
                break;
            default:
                System.out.println("Not fruits");
                break;
        }
    }
}
