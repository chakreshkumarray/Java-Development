public class Two_2D_Jagged_Array {
    public static void main(String[] args) {

        // Jagged A2_Array column and row length of array different
        
        int [][] arr={{2,5,8},{2,4},{3,6,8,9},{7},{9,0,3,8,6}};
        for(int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
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