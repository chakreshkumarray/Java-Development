import java.util.Arrays;
public class Topic7_LC_167_TwoSumInputArrayIsSorted {
    public static void main(String[] args) {

       int[] num = {2,3,5,7,11};
       System.out.println(Arrays.toString(TwoSum(num, 10)));
    }

    public static int[] TwoSum(int[] arr,int target){
        int i = 0;
        int j = arr.length-1;
        while (i<j){
            if (arr[i] + arr[j] < target){
                i++;
            } else if (arr[i] + arr[j] > target) {
                j--;
            }else {
                return new int[]{
                        i + 1, j + 1
                };
            }
        }
        return null;
    }
}
