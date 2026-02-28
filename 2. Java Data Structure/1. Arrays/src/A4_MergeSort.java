public class A4_MergeSort {
    int[] array;
    int[] tempMergeArr;
    int length;
    public static void main(String[] args) {
        /*
        Merge Sort is a Divide and Conquer sorting algorithm that:
        Divides the array into two halves
        Recursively sorts both halves
        Merges the sorted halves into one sorted array

        ⚙️ How It Works
        Example: [38, 27, 43, 3, 9, 82, 10]
        Step 1: Divide
        [38,27,43]   [3,9,82,10]
        Step 2: Divide Until Single Elements
        [38] [27] [43] [3] [9] [82] [10]
        Step 3: Merge & Sort
        [27,38] → [27,38,43]
        [3,9] → [3,9,10,82]
        Final → [3,9,10,27,38,43,82]

        ⏱ Time & Space Complexity
        Best Case: O(n log n), Average Case: O(n log n), Worst Case: O(n log n), Space Complexity: O(n)
         */

        int[] inputArr = {38, 27, 43, 3, 9, 82, 10};
        A4_MergeSort ms = new A4_MergeSort();
        ms.sort(inputArr);

        for (int i: inputArr){
            System.out.println(i);
        }
    }

    public void sort(int[] inputArr){
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0,length - 1);
    }

    public void divideArray(int lowerIndex, int higherIndex){
        if (lowerIndex < higherIndex){
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
            divideArray(lowerIndex, middle); // left side sort
            divideArray(middle + 1, higherIndex); // right side sort
            mergeArray(lowerIndex,middle,higherIndex);
        }
    }

    public void mergeArray(int lowerIndex, int middle, int higherIndex){
        for (int i = lowerIndex; i <= higherIndex; i++){
            tempMergeArr[i] = array[i];
        }
        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex){
            if (tempMergeArr[i] <= tempMergeArr[j]){
                array[k] = tempMergeArr[i];
                i++;
            }else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }
        while (i <= middle){
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }
    }

}
