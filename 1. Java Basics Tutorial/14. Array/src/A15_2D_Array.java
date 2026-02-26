public class A15_2D_Array {
    public static void main(String[] args) {

        // Declaration of Two D A2_Array
        int[][] arr = new int[3][3];

        int[][] num = {{12, 56, 33,},{25, 63, 54},{89, 64, 47}};
        System.out.println(num[0][2]);
        System.out.println(num[1][1]);

        // Access or Traverse by loop
        for(int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){
                System.out.println(num[i][j]);
            }
        }


    }
}
