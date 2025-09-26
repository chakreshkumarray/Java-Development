public class Recursion {
    public static void main(String[] args) {

        System.out.println(Fibonacci(5));

    }

    public static int Fibonacci(int n){
        if (n<1){
            return 0;
        }
        if (n==0){
            return 1;
        }
        return n+Fibonacci(n-1)+Fibonacci(n-2);
    }
}
