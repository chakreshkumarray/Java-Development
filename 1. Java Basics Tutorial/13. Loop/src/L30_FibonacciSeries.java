import java.util.Scanner;

public class L30_FibonacciSeries {
    public static void main(String[] args) {

        // recursion call
        System.out.println(fibonacci(5));

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
    public static int fibonacci(int n){
        if(n == 0){
            return 1;
        }
        if (n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
