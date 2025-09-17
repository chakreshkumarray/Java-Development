public class Topic4_SearchInRotatedSortedArray {
    public static void main(String[] args) {

        System.out.println(Search(new int[] {5,6,7,8,9,10,1,2,3},0,8,10));
    }

    public static int Search(int[] arr, int l, int r, int key){
        int pivot = getPivot(arr, l, r);
        int e = BinarySearch(arr, l, pivot, key);
        if (e == -1){
            e = BinarySearch(arr, pivot + 1, r, key);
        }
        return e;
    }

    public static int getPivot(int[] arr, int l, int r){
        while (l <= r){
            int mid = (l+r)/2;
            if (arr[mid] > arr[mid + 1]){
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                return mid - 1;
            } else if (arr[mid] > arr[l]) {
                l = mid +1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }

    public static int BinarySearch(int[] arr, int l, int r, int n){
        while ( l<= r){
            int mid = (l+r)/2;
            if (arr[mid] == n){
                return  mid;
            } else if (arr[mid] < n) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }

}
