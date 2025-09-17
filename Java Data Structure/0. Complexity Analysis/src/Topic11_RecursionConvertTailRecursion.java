public class Topic11_RecursionConvertTailRecursion {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
        System.out.println(FactorialTail(5));
    }

    public static int Factorial(int n){
        if (n == 1){
            return n;
        }
        return n * Factorial(n-1);
    }

    public static int FactorialTail(int n){
        return helper(n,1);
    }

    public static int helper(int n, int answer){
        if (n == 0){
            return answer;
        }
        return helper(n-1,answer * n );
    }
}
