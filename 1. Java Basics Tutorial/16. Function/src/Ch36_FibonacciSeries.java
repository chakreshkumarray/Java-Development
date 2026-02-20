package Methods;

import java.util.Scanner;

public class Ch36_FibonacciSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = input.nextInt();
        Fibonacci(num);

    }

    public static void Fibonacci(int num){
        if (num < 0){
            System.out.println("0");
        }
        if (num == 0){
            System.out.println("1");
        }

        int first = 0, second = 1;
        while (first + second <= num) {
            int third = first + second;
            System.out.println(third + " ");
            first = second;
            second = third;
        }

    }
}
