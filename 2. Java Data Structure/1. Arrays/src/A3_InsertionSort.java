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

       🔹 Example
          Array: [5, 2, 4, 6, 1, 3]
          Pass 1:
          Insert 2 before 5
          [2, 5, 4, 6, 1, 3]
          Pass 2:
          Insert 4 between 2 and 5
          [2, 4, 5, 6, 1, 3]
          Pass 3:
          6 already in correct position
          [2, 4, 5, 6, 1, 3]
          Pass 4:
          Insert 1 at beginning
          [1, 2, 4, 5, 6, 3]
          Pass 5:
          Insert 3 between 2 and 4
          [1, 2, 3, 4, 5, 6]
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
