public class A27_InsertElementAtPosition {
    public static void main(String[] args) {

        // Insertion of element at specific Position in given array

        int[] arr = {10, 20, 30, 40, 50};

        int position = 3;
        int element = 100;

        for (int i = arr.length - 1; i > position - 1; i--){
            arr[i] = arr[i - 1];
        }
        arr[position - 1] = element;

        for (int j : arr) {
            System.out.println(j + " ");
        }

    }
}
