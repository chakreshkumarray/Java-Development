import java.util.Scanner;

public class L31_HCF {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = input.nextInt();
        System.out.print("Enter second number: ");
        int second = input.nextInt();

        while (second != 0){
            int temp = second;
            second = first % second;
            first = temp;
        }
        System.out.println("HCF: "+ first);
    }
}
