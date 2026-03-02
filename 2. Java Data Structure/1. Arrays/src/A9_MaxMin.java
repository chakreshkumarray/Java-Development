public class A9_MaxMin {
    public static void main(String[] args) {

        // Maximum
        int[] arr = {3, 5, 2, 1, 6};
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++){

            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum Element "+max);

        // Minimum
        int[] num = {3, 5, 2, 1, 6};
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < num.length; i++){

            if (num[i] < min){
                min = num[i];
            }
        }
        System.out.println("Minimum Element "+min);
    }
}
