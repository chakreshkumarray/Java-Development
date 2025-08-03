public class TimeComplexity_FibonacciSeries {
    public static void main(String[] args) {

        Fibonacci(5);
    }

    public static int Fibonacci(int n){
        if (n <= 1){
            return n;
        }
        return Fibonacci(n-1)+Fibonacci(n-2);
    }

}
     /*
     Time Complexity is : O(2^n) -> 2 Power of n
      */