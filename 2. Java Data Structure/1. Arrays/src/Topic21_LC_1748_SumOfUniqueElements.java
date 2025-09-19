import java.util.HashMap;
import java.util.Map;

public class Topic21_LC_1748_SumOfUniqueElements {
    public static void main(String[] args) {

        System.out.println(SumOfUnique (new int[] {1,2,3,2}));
        System.out.println(SumOfUnique(new int[] {1,2,3,4,5}));
    }

    public static int SumOfUnique(int[] nums){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums){
            map.put(i,map.getOrDefault(i,0) + 1);
        }
        int res = 0;
        for (int i : map.keySet()){
            if (map.get(i) == 1){
                res += i;
            }
        }
        return res;
    }
}
