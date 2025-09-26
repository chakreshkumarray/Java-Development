import java.util.Scanner;

public class Ch19_Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        
        if (num >= 90){
            System.out.println("A");
        } else if (num >= 75) {
            System.out.println("B");
        } else if (num >= 60) {
            System.out.println("C");
        } else if (num >= 30) {
            System.out.println("D");
        }else {
            System.out.println("E");
        }

    }
}
