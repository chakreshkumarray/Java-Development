import java.util.HashSet;

public class A25_LongestSubSequence {
    public static void main(String[] args) {

        // input = 3, 9, 1, 10, 4, 20, 2
        // output = 1, 2, 3, 4 --> Answer
        // output = 9, 10
        // output = 20

        int[] arr = {3, 9, 1, 10, 4, 20, 2};

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            set.add(arr[i]);
        }
        int len = 0;
        for (int i = 0; i < arr.length; i++){
            if (!set.contains(arr[i] - 1)){
                int number = arr[i];
                while (set.contains(number)) {
                    number++;
                }if (len < number - arr[i]){
                    len = number - arr[i];
                }
            }
        }
        System.out.println("Longest sub sequence length is :"+len);
    }
}
