public class Ch42_maximumAndMinimumElement {
    public static void main(String[] args) {

        int[] arr = {13,16,90,64,16,33,52};

        // For Minimum Value
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Maximum value is: "+max);


        // For Minimum Value
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum value is: "+min);
    }


}
