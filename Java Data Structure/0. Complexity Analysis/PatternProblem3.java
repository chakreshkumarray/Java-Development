/*
    Question 3: Print the fallowing Pattern for the given N number of rows.
                Pattern for N = 4 , N = 3 , N = 5

                            1234    123     12345
                            1234    123     12345
                            1234    123     12345
                            1234            12345
                                            12345
 */
public class PatternProblem3 {
    public static void main(String[] args) {
        PrintPattern(4);
        PrintPattern(3);
        PrintPattern(5);
    }

    public static void PrintPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

}
