public class A26_MaximumSubArrayKadaneAlgorithm {
    public static void main(String[] args) {

        // Find sub array of maximum sum in array of positive and negative number
        // input = 4, -2, -3, 4, -1, -2, 1, 5, -3
        // output = 7
        int[] arr = {4, -2, -3, 4, -1, -2, 1, 5, -3};

        int max_far = Integer.MIN_VALUE;
        int max_end = 0;

        int start = 0, end = 0, search = 0;

        for (int i = 0; i < arr.length; i++){
            max_end = max_end + arr[i];
            if (max_far < max_end){
                max_far = max_end;
                start = search;
                end = i;
            }if (max_end < 0){
                max_end = 0;
                search = i + 1;
            }
        }
        System.out.println(max_far);
        System.out.println("Starting index is "+start + " and"+" Ending index is "+end);
    }
}
