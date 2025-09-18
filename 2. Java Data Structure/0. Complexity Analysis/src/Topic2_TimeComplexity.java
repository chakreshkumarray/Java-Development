import static java.lang.Math.pow;

public class Topic2_TimeComplexity {
    public static void main(String[] args) {

        // Example  :- 1
        int n = 10;
        for (int  i = 1; i <= n; i++){
            System.out.println(n);
        }
        /*
        Time Complexity is : O(n)
         */

        // Example :- 2
        int n1 = 12;
        for (int i = 1; i <= n1; i++){
            System.out.println(n1);
        }
        int m1 = 12;
        for (int i = 1; i <= m1; i++){
            System.out.println(m1);
        }
        /*
        Time Complexity is : O{n+m)
         */

        // Example :-3
        int n2 = 20;
        int m2 = 20;
        for (int i = 1; i <= n2; i++){
            for (int j = 1; j <= m2; j++){
                System.out.println(n2 * m2);
            }
        }
        /*
        Time Complexity is : O(n.m)
         */

        int c = 10;
        for (int i = 2; i <= n; i = (int) pow(i,c)){
            System.out.println();
        }
        /*
        Time Complexity is : O(log(log2n))
         */

    }
}
