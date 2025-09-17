import java.util.Arrays;

public class Topic12_LC_2090_KRadiusSubArrayAverage {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(getAverage(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3)));
    }

    public static int[] getAverage(int[] nums, int k){
        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res,-1);

        long window = 0;
        int kk = k;
        int idx = 2*k+1;

        if(idx > n){
            return res;
        }

        for(int i = 0; i < idx; i++){
            window += nums[i];
        }
        res[kk] = (int)(window / idx);

        for(int i = idx; i < n; i++){
            window = window- nums[i-idx] + nums[i];
            res[++k] = (int)(window / idx);
        }
        return res;
    }
}
