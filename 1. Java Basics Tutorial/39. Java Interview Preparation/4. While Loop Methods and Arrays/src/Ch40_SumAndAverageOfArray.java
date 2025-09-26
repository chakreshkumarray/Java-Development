public class Ch40_SumAndAverageOfArray {
    public static void main(String[] args) {

        int[] arr = {45,74,63,66,41};
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
            avg = sum/arr.length;
        }
        System.out.println("Sum of Array: "+sum);
        System.out.println("Average of Array: "+avg);
    }
}
