package Array;

public class Ch44_DeletionInArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int indexToRemove = 2;

        // Shift elements to the left from position
        for (int i = indexToRemove; i < arr.length-1; i++){
            arr[i] = arr[i + 1];
        }

        // Display new array (ignore last element)
        for (int i = 0; i < arr.length-1; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
