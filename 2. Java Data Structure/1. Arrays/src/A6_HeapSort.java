public class A6_HeapSort {
    public static void main(String[] args) {
         /*
         We’ll sort:[4, 10, 3, 5, 1]

         Step 1: Build a Max Heap
         A max heap ensures the largest element is at the root.
         Initial array: [4, 10, 3, 5, 1]
         After heapify: [10, 5, 3, 4, 1]
         (10 is the largest, placed at root)

         Step 2: Extract Max Element
         Swap the root (largest) with the last element, then reduce heap size.
         Swap 10 and 1: [1, 5, 3, 4, 10]
         Heapify first 4 elements: [5, 4, 3, 1, 10]

         Step 3: Repeat
         Swap 5 and 1: [1, 4, 3, 5, 10]
         Heapify first 3 elements: [4, 1, 3, 5, 10]
         Swap 4 and 3: [3, 1, 4, 5, 10]
         Heapify first 2 elements: [3, 1, 4, 5, 10]
         Swap 3 and 1: [1, 3, 4, 5, 10]

         Final Sorted Array
         [1, 3, 4, 5, 10]
         */
        int[] arr = {22, 13, 17, 11, 10, 14, 12};
        A6_HeapSort hs = new A6_HeapSort();
        hs.sort(arr);
        hs.printArray(arr);
    }

    public void sort(int[] arr){
        int leng = arr.length;

        for (int i = leng / 2 - 1; i >= 0; i--){
            heapy(arr, leng, i);
        }

        for (int i = leng - 1; i >= 0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            heapy(arr, i, 0);
        }
    }

    public void heapy(int[] arr, int n, int i){
        int largest = i;
        int li = 2 * i + 1;
        int ri = 2 * i + 2;

        if (li < n && arr[li] > arr[largest]){
            largest = li;
        }
        if (ri < n && arr[ri] > arr[largest]){
           largest = ri;
        }
        if (largest != i){
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapy(arr, n, largest);
        }
    }

    public void printArray(int[] arr){
        for (int i : arr){
            System.out.println(i);
        }
    }
}
