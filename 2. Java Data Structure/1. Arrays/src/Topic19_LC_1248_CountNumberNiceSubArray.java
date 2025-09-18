import java.util.HashMap;
import java.util.Map;

public class Topic19_LC_1248_CountNumberNiceSubArray {
    public static void main(String[] args) {

        System.out.println(numberOfSubarrays(new int[]{1, 1, 2, 1, 1}, 3));
        System.out.println(numberOfSubarrays(new int[]{2, 4, 6}, 1));
        System.out.println(numberOfSubarrays(new int[]{2, 2, 2, 1, 2, 2, 1, 2, 2, 2}, 2));
    }

    public static int numberOfSubarrays(int[] nums, int k){
        int res = 0;
        int curr = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i : nums){
            curr += i % 2;
            res += map.getOrDefault(curr - k,0);
            map.put(curr,map.getOrDefault(curr,0) + 1);
        }
        return res;
    }
}
