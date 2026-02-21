import java.util.Scanner;

public class L30_FibonacciSeries {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();

        int first = 0;
        int second = 1;

        System.out.println("Fibonacci Series up to "+num +" terms: ");

        for (int i = 1; i <= num; i++){

            System.out.print(first+" ");

            int next = first + second; // temp = a + b
            first = second;           // a = b
            second = next;            // b = temp
        }
    }
}
