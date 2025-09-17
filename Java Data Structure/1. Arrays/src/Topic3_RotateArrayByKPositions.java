import java.util.Arrays;

public class Topic3_RotateArrayByKPositions {
    public static void main(String[] args) {

        int[] arr = {2,3,4,5,6};
        LeftRotate(arr,5,2);
        System.out.println(Arrays.toString(arr));
    }

    public static void Reverse(int[] arr, int i, int j){
        while ( i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void LeftRotate(int[] arr,int n, int d){
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);
    }

}
