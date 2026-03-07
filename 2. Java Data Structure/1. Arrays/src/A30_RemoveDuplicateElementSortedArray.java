public class A30_RemoveDuplicateElementSortedArray {
    public static void main(String[] args) {

        // Remove Duplicate Element from Sorted Array

        int[] arr = {1, 2, 2, 3, 4, 5, 5};
        int[] temp = new int[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] != arr[i + 1]){
                temp[j] = arr[i];
                j++;
            }
        }
        temp[j] = arr[arr.length - 1];
        for (int i : temp){
            System.out.println(i);
        }
    }
}
