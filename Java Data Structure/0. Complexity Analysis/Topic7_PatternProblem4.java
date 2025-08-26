/*
    Question 4: Print the fallowing Pattern for the given N number of rows.
                Pattern for N = 4 , N = 3 , N = 5

                            1111    111     11111
                            2222    222     22222
                            3333    333     33333
                            4444            44444
                                            55555
 */
public class Topic7_PatternProblem4 {
    public static void main(String[] args) {
        PrintPattern(4);
        PrintPattern(3);
        PrintPattern(5);
    }

    public static void PrintPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }

}
