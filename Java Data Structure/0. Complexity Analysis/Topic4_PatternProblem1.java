/*
Question 1 : Print the fallowing Pattern for the given N number of rows.
           Pattern for N = 4 , N = 7
           4444               7777777
           4444               7777777
           4444               7777777
           4444               7777777
                              7777777
                              7777777
                              7777777
 */
public class Topic4_PatternProblem1 {
    public static void main(String[] args) {
        PrintPattern(4);
        PrintPattern(7);
    }

    public static void PrintPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(n);
            }
            System.out.println();
        }

    }

}
