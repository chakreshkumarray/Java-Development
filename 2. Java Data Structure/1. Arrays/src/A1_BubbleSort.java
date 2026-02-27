public class A1_BubbleSort {
    public static void main(String[] args) {

        /*
        📌 What is Bubble Sort?
            Bubble Sort is a simple comparison-based sorting algorithm where:
            Adjacent elements are compared
            Swapped if they are in the wrong order
            Largest element “bubbles up” to the end in each pass

        📌 Time Complexity
            Best Case (Already Sorted):	O(n) (with optimization)
            Average Case:	O(n²)
            Worst Case:	O(n²)
            Space Complexity: → O(1) (In-place sorting)

        📌 Where use:
            in college for teaching student

        📌 When use :
             for small data set array size(5- 20)
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