public class Topic1_LinearSearchArray {
    public static void main(String[] args) {

        int[]arr = {2,3,1,9};
        System.out.println(linearSearch(arr,3));
    }

    public static int linearSearch(int[] arr, int n){
        for (int  i = 0; i <= arr.length; i++){
            if (arr[i] == n){
                return n;              // Or  i
            }
        }
        return -1;
    }

}
