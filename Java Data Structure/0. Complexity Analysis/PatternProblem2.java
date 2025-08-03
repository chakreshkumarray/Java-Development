/*
    Question 2: Print the fallowing Pattern for the given N number of rows.
                Pattern for N = 4

           ****
           ****
           ****
           ****
 */
public class PatternProblem2 {
    public static void main(String[] args) {
        PrintPattern(4);
    }

    public static void PrintPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
