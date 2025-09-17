import java.util.HashMap;
import java.util.Map;

public class Topic18_LC_560_SubArraySumEqualsK {
    public static void main(String[] args) {

        System.out.println(SubArraySum(new int[] {1,1,1},2));
        System.out.println(SubArraySum(new int[] {1,2,3},3));
    }

    public static int SubArraySum(int[] nums ,int k){
        int res = 0;
        int curr = 0;

        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        for (int i : nums){
            curr += i;
            res += map.getOrDefault(curr - k ,0);
            map.put(curr, map.getOrDefault(curr,0) + 1);
        }
        return res;
    }
}
