package Array;

public class Ch43_ArrayIsSorted {
    public static void main(String[] args) {

        int[] arr = {56,31,41,15,66,29};

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted.");
                break;
            }
        }

    }
}
