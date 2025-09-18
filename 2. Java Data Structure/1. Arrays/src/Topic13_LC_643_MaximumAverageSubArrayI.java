public class Topic13_LC_643_MaximumAverageSubArrayI {
    public static void main(String[] args) {

        System.out.println(FindMaxAverage(new int[] {1,12,-5,-6,50,3},4));
    }

    public static double FindMaxAverage(int[] nums, int k){
        int n = nums.length;
        double ans = 0;
        double window = 0;

        for(int i = 0; i<k; i++){
            window = window + nums[i];
        }

        ans = window / k;

        for(int right = k; right < nums.length; right++){
            window = window+nums[right]-nums[right-k];
            ans = Math.max(ans,window / k);
        }
        return ans;
    }
}
