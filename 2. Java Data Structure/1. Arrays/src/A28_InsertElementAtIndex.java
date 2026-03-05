public class A28_InsertElementAtIndex {
    public static void main(String[] args) {

        // Insertion of element at specific Position in given array

        int[] arr = {10, 20, 30, 40, 50, 60};

        int index = 4;
        int element = 100;

        for (int i = arr.length - 1; i > index; i--){
            arr[i] = arr[i - 1];
        }
        arr[index] = element;

        for (int j : arr) {
            System.out.println(j + " ");
        }

    }
}
