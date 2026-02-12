package Raykor_Coding_Questions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleCombinations {
    public static void main(String[] args) {

        // nums = [10,1,2,7,6,1,5]
        // target = 8
        // Output: [ [1,1,6], [1,2,5], [1,7], [2,6] ]

        // nums = [2,5,2,1,2]
        // target = 5
        // Output: [[2,2,1],[5]]

        int[] nums = {10,1,2,7,6,1,5};
        int target = 8;

        Arrays.sort(nums);
        System.out.println("Combinations for 8: ");
        find(new ArrayList<>(),nums,target,0);
    }

    public static void find(List<Integer> current, int[] nums, int remain, int start){
        if (remain == 0){
        System.out.println(current);
        return;
        }
        for (int i = start; i < nums.length; i++){
            if (i > start && nums[i] == nums[i -1]) continue;
            if (nums[i] > remain) break;
            current.add(nums[i]);
            find(current, nums, remain - nums[i], i+1);
            current.remove(current.size()-1);
        }
    }
}
