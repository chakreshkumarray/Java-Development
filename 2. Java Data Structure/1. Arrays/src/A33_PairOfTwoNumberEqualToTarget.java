import java.util.HashSet;
import java.util.Set;

public class A33_PairOfTwoNumberEqualToTarget {
    public static void main(String[] args) {
        /*
        input = {2, 3, 7, 8, 6, 1}
        output = 9 or {2, 7}, {4, 5}, {8, 1};
        Find pairs of two numbers whose sum is equal to target value.
         */

        int[] arr = {2, 3, 7, 8, 6, 1};
        int target = 9;

        for (int i = 0; i < arr.length - 1; i++){ // Brute force method known as
            for (int j = i + 1; j < arr.length; j++){

                if (arr[i] + arr[j] == target){
                    System.out.println("target pair: "+arr[i]+", "+arr[j]);
                }
            }
        }

        /* By Collection Framework if you want single loop */
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            int difference = target - arr[i];

            if (set.contains(difference)){
                System.out.println(arr[i]+", "+difference);
            }else {
                set.add(arr[i]);
            }
        }

    }
}
