import java.util.HashMap;
import java.util.Map;

public class Topic16_LC_2342_MaxSumPairWithEqualSumDigits {
    public static void main(String[] args) {

        System.out.println(MaximumSum(new int[] {18,43,36,13,7}));
    }

    public static int MaximumSum(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for (int i = 0; i < nums.length; i++){
            int s = sum(nums[i]);
            if (map.containsKey(s)){
                res = Math.max(res , nums[i] + map.get(s));
                if (nums[i] > map.get(s)){
                    map.put(s,nums[i]);
                }
            }else {
                map.put(s,nums[i]);
            }
        }
        return res;
    }


    public static int sum (int n){
        int sum = 0;
        while (n > 0){
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }

}
