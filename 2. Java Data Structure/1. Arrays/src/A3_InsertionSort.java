public class A3_InsertionSort {
    public static void main(String[] args) {

        /*
        Insertion Sort is a comparison-based sorting algorithm that builds the final
        sorted array one element at a time by inserting each element into its correct
        position in the already sorted part of the array.

        It works similar to how we arrange playing cards in our hands.

      ⚙️ How It Works (Logic)
          Assume first element is already sorted.
          Pick the next element.
          Compare it with elements before it.
          Shift larger elements one position to the right.
          Insert the element at its correct position.
          Repeat until the array is sorted.

      ⏱ Time & Space Complexity
          Best Case (Already Sorted): O(n)
          Average Case: O(n²)
          Worst Case (Reverse Sorted): O(n²)
          Space Complexity: O(1) (In-place)
         */
        int[] arr = {5, 1, 6, 2, 4, 3};
        int temp;
        int j;
        for (int i = 0; i < arr.length; i++){
            temp = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > temp){
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
        for (int i: arr){
            System.out.println(i);
        }
    }
}
