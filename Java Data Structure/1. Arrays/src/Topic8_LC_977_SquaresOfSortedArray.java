import java.util.Arrays;
public class Topic8_LC_977_SquaresOfSortedArray {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(Square(new int[]{-4, -1, 0, 3, 10})));
        System.out.println(Arrays.toString(SquareOfArray(new int[]{-4, -1, 0, 3, 10})));

    }

    public static int[] SquareOfArray(int[] nums){
        int l = 0;
        int r = nums.length -1;
        int[] res = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--){
            if (Math.abs(nums[l]) > Math.abs(nums[r])){
                res[i] = nums[l] * nums[l];
                l++;
            }else {
                res[i] = nums[r] * nums[r];
                r--;
            }
        }
        return res;
    }

    public static int[] Square(int[] nums){
        int[] arr = Arrays.stream(nums).map(i -> i*i).toArray();
        Arrays.sort(arr);
        return arr;
    }
}
