public class A29_DeleteElement {
    public static void main(String[] args) {

        // How to Remove specific element from an array
        int[] arr = {10, 40, 30, 50, 60, 20};
        int delete = 30;
        for (int i = 0; i < arr.length; i++){
            if (delete == arr[i]){
                for (int j = i; j < arr.length - 1; j++){
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }
        for (int i : arr){
            System.out.println(i);
        }
    }
}
