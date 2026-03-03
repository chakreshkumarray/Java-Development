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

        // Other Method
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE){
            System.out.println("There is no second largest element in the list..");
        }
        else {
            System.out.println("Second Largest Element : " + secondLargest);
        }
    }
}
