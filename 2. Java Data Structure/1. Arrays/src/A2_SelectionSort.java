public class A2_SelectionSort {
    public static void main(String[] args) {
        /*
        ✅ Definition
         Selection Sort is a comparison-based sorting algorithm that repeatedly finds the
         minimum element from the unsorted portion of the array and places it at the correct position by swapping.

       ⏱ Time & Space Complexity
          Best Case: O(n²), Average Case: O(n²), Worst Case: O(n²), Space Complexity: O(1) (In-place)

       📍 Where It Is Used
           Small datasets, When memory usage must be minimal

        🔹 Example
           Array: [29, 10, 14, 37, 13]
           Pass 1:
           Minimum = 10 → Swap with 29
           [10, 29, 14, 37, 13]
           Pass 2:
           Minimum = 13 → Swap with 29
           [10, 13, 14, 37, 29]
           Pass 3:
           Minimum = 14 → Already correct
           [10, 13, 14, 37, 29]
           Pass 4:
           Minimum = 29 → Swap with 37
           [10, 13, 14, 29, 37]
         */
        int[] arr = {38, 52, 9, 18, 6, 62, 13};
        for (int i = 0; i < arr.length; i++){

            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[minIndex]){

                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i : arr){
            System.out.println(i);
        }
    }
}
