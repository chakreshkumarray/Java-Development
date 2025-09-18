public class Topic2_BinarySearchArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(BinarySearch(arr,5));

    }

    public static int BinarySearch(int[] arr,int n){
        int l = 0;
        int r = arr.length-1;
        while (l <= r){
            int mid = (l + r) / 2;
            if (arr [mid] == n){
                return mid;
            } else if (n < arr[mid]) {
                r = mid-1;
            }else {
                l = mid + 1;
            }
        }
        return -1;
    }

}
