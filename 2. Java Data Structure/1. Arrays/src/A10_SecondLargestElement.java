public class A10_SecondLargestElement {
    public static void main(String[] args) {

        // Find Second-Largest Number
        int[] arr = {6, 8, 2, 4, 3, 1, 5, 7};

        for (int i = 0; i < arr.length; i++){
            int temp;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Second Largest Element is: "+arr[1]);

    }
}
