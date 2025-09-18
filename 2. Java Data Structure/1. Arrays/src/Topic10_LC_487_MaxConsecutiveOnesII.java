public class Topic10_LC_487_MaxConsecutiveOnesII {
    public static void main(String[] args) {

        System.out.println(FindMaxConsecutive(new int[] {1,0,1,1,0}));
    }

    public static int FindMaxConsecutive(int[] nums){
        int left = 0;
        int ans = 0;
        int window = 0;
        for (int right = 0; right < nums.length; right++){
            window += nums[right];
            while (! (window == right -left +1 || window == right -left)){
                window -= nums[left];
            }
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}
