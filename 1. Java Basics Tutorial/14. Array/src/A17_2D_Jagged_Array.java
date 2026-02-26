public class A17_2D_Jagged_Array {
    public static void main(String[] args) {

        // Jagged Array column and row length of array different
        
        int [][] arr = {{2, 5, 8},{2, 4},{3, 6, 8, 9},{7},{9, 0, 3, 8, 6}};
        for (int[] a : arr) {
            for (int b : a) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
    }
}
/* output
2 5 8
2 4
3 6 8 9
7
9 0 3 8 6
*/