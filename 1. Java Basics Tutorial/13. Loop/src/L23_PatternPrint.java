import java.util.Scanner;

public class L23_PatternPrint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++){
            for (int j = 1; j<= i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
