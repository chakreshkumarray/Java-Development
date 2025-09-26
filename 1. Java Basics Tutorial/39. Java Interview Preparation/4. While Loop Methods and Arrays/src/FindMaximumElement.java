public class FindMaximumElement {
    public static void main(String[] args) {

        int[] arr = {16,25,51,77,80,45,39,99};
        int result = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i] > result){
                result = arr[i];
            }
        }
        System.out.println("Maximum Element is: "+result);
    }
}
