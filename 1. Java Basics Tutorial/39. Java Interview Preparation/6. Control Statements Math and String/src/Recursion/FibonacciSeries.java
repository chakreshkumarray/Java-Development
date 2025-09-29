package Recursion;
public class FibonacciSeries {
    public static void main(String[] args) {

        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int n){
        if (n<1){
            return 0;
        }
        return n+Fibonacci(n-1)+Fibonacci(n-2);
    }
}
