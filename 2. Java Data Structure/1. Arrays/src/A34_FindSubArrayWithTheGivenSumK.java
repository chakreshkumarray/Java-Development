import java.util.HashMap;
public class A34_FindSubArrayWithTheGivenSumK {
    public static void main(String[] args) {
        /*
        Find the sub array with the given sum
        input = {10, 15, -5, 15, -10, 5};
        output / sum = 5 or {15, -10}
        -- HashMap
         */

        int[] arr = {10, 15, -5, 15, -10, 5};
        int target = 5;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0, -1);

        int currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            int difference = currSum - target;

            if (map.containsKey(difference)) {
                int start = map.get(difference) + 1;

                System.out.println(arr[start] + ", " + arr[i]);
                break; // if you want 5 remove break
            }
            map.put(currSum, i);
        }
    }
}
