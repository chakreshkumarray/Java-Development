import java.util.Arrays;

public class Topic6_LC_26_RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,4,4,5};
        System.out.println(Arrays.toString(RemoveDuplicates(num)));
    }

    public static int[] RemoveDuplicates(int[] nums){
        int unique = 1;
        for (int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                unique += 1;
                nums[unique -1] = nums[i];
            }
        }
        return new int[]{unique};
    }


}
