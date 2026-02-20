package Array;

public class Ch44_InsertionInArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};
        int InsertToElement = 70;
        int position = 2;

        for (int i = arr.length-1; i >= position; i--){
            arr[i] = arr[i-1];
        }

        arr[position] = InsertToElement;

        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
