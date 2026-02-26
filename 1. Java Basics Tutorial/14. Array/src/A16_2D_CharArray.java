public class A16_2D_CharArray {
    public static void main(String[] args) {

        // Declaration
        char[][] arr = new char[3][2]; //3*2=6;
        arr[0][0] = 'c';
        arr[0][1] = 'h';
        arr[1][0] = 'a';
        arr[1][1] = 'k';
        arr[2][0] = 'r';
        arr[2][1] = 'e';

        //different size array row not equal array

        for(int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        /* different size array row not equal array
         c h
         a k
         r e
         */

    }
}
