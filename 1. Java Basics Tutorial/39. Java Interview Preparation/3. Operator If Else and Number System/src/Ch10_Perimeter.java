import java.util.Scanner;

public class Ch10_Perimeter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter sides of rectangle: ");
        int A = input.nextInt();
        int B = input.nextInt();
        int C = input.nextInt();
        int D = input.nextInt();

        int Perimeter = A+B+C+D;

        System.out.println("Perimeter of rectangle is: "+Perimeter);
    }
}
