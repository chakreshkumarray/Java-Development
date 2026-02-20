package TwoDArray;

public class TwoDArrayTraverse {
    public static void main(String[] args) {

        int[][] arr = {{7,3,7},{8,8,5,6,9},{7,7,4,6,2,4,6}};

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                System.out.println(arr[i][j]);
            }
        }

    }
}
