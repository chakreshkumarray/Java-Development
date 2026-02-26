import java.util.Scanner;

public class A7_SearchElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int[] arr = {16, 23, 54, 78, 99, 54};
        for (int j : arr) {
            if (j == num) {
                System.out.println("Found");
            }
        }

    }
}
