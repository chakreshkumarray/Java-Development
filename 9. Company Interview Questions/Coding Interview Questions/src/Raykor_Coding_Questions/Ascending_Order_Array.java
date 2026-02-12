package Raykor_Coding_Questions;

public class Ascending_Order_Array {
    public static void main(String[] args) {

        // Array in Ascending Order
        // Input: [11,60,36,56,48,23,47]
        // Output: [11,23,36,47,48,56,60]

        int[] arr = {11,60,36,56,48,23,47};

        for (int i = 0; i< arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }
}
