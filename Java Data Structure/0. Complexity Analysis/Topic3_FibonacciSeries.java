public class Topic3_FibonacciSeries {
    public static void main(String[] args) {

        System.out.println(Fibonacci(5));
    }

    public static int Fibonacci(int n){
        if (n <= 1){
            return 1;
        }
        return Fibonacci(n-1) + Fibonacci(n-2);
    }

}
     /*
     Time Complexity is : O(2^n) -> 2 Power of n
      */