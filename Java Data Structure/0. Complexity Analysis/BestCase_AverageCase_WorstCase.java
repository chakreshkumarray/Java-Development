public class BestCase_AverageCase_WorstCase {
    public static void main(String[] args) {

        int[] num1 = {3, 2, 1, 9, 7};
        boolean num  = LinearSearch(num1,5);
        System.out.println(num);
    }

    public static boolean  LinearSearch(int[] arr,int n) {

         /*
        Linear Search(arr,n)
         */

        for (int i = 0 ; i<= arr.length; i++) {
            if (arr[i] == n){
                return true;
            }
        }
        return false;

        /*
        Best Case:     3     (Minimum)
        Average Case : 1     (Middle)
        Worst Case :   7     (Maximum)
         */
    }
}