public class A5_QuickSort {
    public static void main(String[] args) {

        /*
        Quick Sort is a divide-and-conquer sorting algorithm.
        It works by choosing a pivot element, partitioning the array around it,
        and then recursively sorting the subarrays.

        Steps
        Choose a Pivot
        Can be the first, last, random, or median element.

        Partition the Array
        Rearrange elements so that those smaller than the pivot go to its left, and larger ones go to its right.

        Recursive Calls
        Apply the same process to the left and right subarrays.

        Base Case
        Stops when subarrays have one element (already sorted)

        Example Array: [10, 7, 8, 9, 1, 5]

        Step 1: Choose a Pivot
        Let’s pick the last element as the pivot (common choice).
        Pivot = 5

        Step 2: Partition
        Rearrange so that:
        Elements smaller than 5 go to the left.
        Elements greater than 5 go to the right.
        Result after partition:
        [1, 5, 10, 7, 8, 9]
        (5 is now in its correct sorted position)

        Step 3: Recursive Calls
        Now sort the two subarrays:
        Left: [1] → already sorted.
        Right: [10, 7, 8, 9]

        Step 4: Partition Right Subarray
        Pivot = 9
        Rearrange: [7, 8, 9, 10] (9 is in correct position)

        Step 5: Sort Remaining Subarrays
        Left of 9: [7, 8] → Pivot = 8 → [7, 8] (sorted)
        Right of 9: [10] → already sorted

        Final Sorted Array
        [1, 5, 7, 8, 9, 10]
         */

        int[] arr = {15, 9, 7, 13, 12, 16, 4, 18, 11};
        int leng = arr.length;
        A5_QuickSort qsm = new A5_QuickSort();
        qsm.quickSortRecursion(arr,0, leng-1);
        qsm.printArray(arr);
    }

    public int partition(int[] arr, int low, int high){
        int pivot = arr[(low + high) / 2]; // middle
        // int pivot = arr[low];           lower index position
        while (low <= high){
            while (arr[low] < pivot){
                low++;
            }
            while (arr[high] > pivot){
                high--;
            }
            if (low <= high){
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high]= temp;

                low++;
                high--;
            }
        }
        return low;
    }

    void quickSortRecursion(int[] arr, int low, int high){
        int pi = partition(arr, low, high);
        if(low < pi -1){
            quickSortRecursion(arr, low, pi - 1);
        }
        if (pi < high){
            quickSortRecursion(arr, pi, high);
        }
    }

    void printArray(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
}
