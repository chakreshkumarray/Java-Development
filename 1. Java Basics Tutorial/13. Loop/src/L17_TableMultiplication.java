import java.util.Scanner;

public class L17_TableMultiplication {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int i = 1;
        while (i <= 10){
            System.out.println(num+" X "+i +" = "+num * i);
            i++;
        }

    }
}