public class Topic14_LC_209_MinimumSizeSubArray {
    public static void main(String[] args) {

        System.out.println(MinSubArrayArrayLen(7,new int[] {2,3,1,2,4,3}));
    }

    public static int MinSubArrayArrayLen(int target, int[] nums){
        int n = nums.length;
        int window = 0;
        int ans = n + 1;
        int left  = 0;

        for (int right = 0; right < n; right++){
            window += nums[right];

            while (window >= target){
                ans = Math.min(ans , right - left + 1);
                window -= nums[left++];
            }
        }
        return ans == n + 1 ? 0: ans;
    }
}
