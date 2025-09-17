public class Topic11_LC_1004_MaxConsecutiveOnesIII {
    public static void main(String[] args) {

        System.out.println(MaxConsecutive(new int[] {1,1,1,0,0,0,1,1,1,1,0},2));
    }

    public static int MaxConsecutive(int[] nums, int k){
        int left = 0;
        int ans = 0;
        int window = 0;

        for(int right = 0; right < nums.length; right++){
            window += nums[right];
            while(window + k < right - left + 1){
                window -= nums[left];
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
