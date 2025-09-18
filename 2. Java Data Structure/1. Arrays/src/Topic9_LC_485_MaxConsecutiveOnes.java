public class Topic9_LC_485_MaxConsecutiveOnes {
    public static void main(String[] args) {

        System.out.println(FindMaxConsecutiveOne(new int[] {1,1,0,1,1,1}));
    }

    public static int FindMaxConsecutiveOne(int[] nums){
        int left = 0;
        int ans = -1;
        int window = 0;
        for(int right = 0; right < nums.length; right++){
            window += nums[right];
            while(right - left + 1 != window){
                window -= nums[left];
                left++;
            }
            ans = Math.max(ans,right - left + 1);
        }
        return ans;
    }
}
