public class A1_BubbleSort {
    public static void main(String[] args) {
        /*
        📌 What is Bubble Sort?
            Bubble Sort is a simple comparison-based sorting algorithm where:
            Adjacent elements are compared
            Swapped if they are in the wrong order
            Largest element “bubbles up” to the end in each pass

        📌 Time Complexity
            Best Case (Already Sorted):	O(n) (with optimization), Average Case:	O(n²). Worst Case:O(n²)
            Space Complexity: → O(1) (In-place sorting)

        📌 Step by Step:-
            🔢 Given Array:[5, 1, 4, 2, 8]
            🔁 Pass 1
            Compare adjacent elements:
            (5, 1) → swap → [1, 5, 4, 2, 8]
            (5, 4) → swap → [1, 4, 5, 2, 8]
            (5, 2) → swap → [1, 4, 2, 5, 8]
            (5, 8) → no swap
            ✅ After Pass 1:
            [1, 4, 2, 5, 8]
            👉 Largest element 8 fixed at last position.
            🔁 Pass 2
            (1, 4) → no swap
            (4, 2) → swap → [1, 2, 4, 5, 8]
            (4, 5) → no swap
            ✅ After Pass 2:
            [1, 2, 4, 5, 8]
            👉 Second largest 5 fixed.
            🔁 Pass 3
            (1, 2) → no swap
            (2, 4) → no swap
            ✅ No swaps → Array is sorted.
            🎯 Final Sorted Array
            [1, 2, 4, 5, 8]
         */
        int[] arr = {12, 11, 50, 25, 17,48};
        for (int i = 0; i < arr.length; i++){
            int flag = 0;                               // large data set
            for (int j = 0; j < arr.length - 1; j++){   // large data 1 - i
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;                          // large data set
                }
            }
            if (flag == 0){                            //large data set
                break;
            }

        }
        for (int i : arr){
            System.out.println(i);
        }

    }
}