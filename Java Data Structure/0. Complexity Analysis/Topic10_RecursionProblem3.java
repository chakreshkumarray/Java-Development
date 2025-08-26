public class Topic10_RecursionProblem3 {
    public static void main(String[] args) {

        System.out.println(Tail(5));
        System.out.println(NonTail(5));
    }

    /*
    Tail Recursion
     */

    public static Object Tail(int n){
        if (n == 1){
            System.out.println(n);
            return n;
        }
        Tail(n-1);
        System.out.println(n);
        return null;
    }

    /*
    Non-Tail Recursion
     */
    public static Object NonTail(int n){
        if (n == 1){
            System.out.println(n);
            return n;
        }
        System.out.println(n);
        NonTail(n-1);
        return null;
    }
}
