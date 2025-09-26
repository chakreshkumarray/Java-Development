public class SumOfArray {
    public static void main(String[] args) {

        int[] arr = {54,32,58,46,12,36,78,65,89};

        int sum = 0;
        int average = 0;
        for (int i = 0; i < arr.length; i++){
            sum =  sum + arr[i];
            average = sum/arr.length;
        }
        System.out.println("Sum of Array is: "+sum);
        System.out.println("Average of Array is: "+average);

    }
}
