public class Topic9_RecursionProblem2 {
    public static void main(String[] args) {

        System.out.println(RecursiveCall(12));
    }

    public static int RecursiveCall(int n){
        if (n <= 1){
            return 1;
        }
        return RecursiveCall(n/2) + n/2;
    }

}
