import java.util.*;
import java.util.stream.Collectors;

public class Topic17_LC_2248_IntersectionMultipleArrays {
    public static void main(String[] args) {
        System.out.println(intersection(new int[][]{{3,1,2,4,5},{1,2,3,4},{3,4,5,6}}));
        System.out.println(intersection(new int[][]{{1,2,3},{4,5,6}}));
    }

    public static List<Integer> intersection(int[][] nums){
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>();

        for (int[] arr : nums){
            for (int i : arr){
                map.put(i, map.getOrDefault(i,0) + 1);
            }
        }
        return map.keySet().stream().filter(i -> map.get(i) == n).sorted().
                collect(Collectors.toList());
    }
}
