import java.util.HashSet;

public class A19_FirstDuplicateElement {
    public static void main(String[] args) {

        // Find first duplicate element in given array

        int[] arr = {6, 5, 3, 2, 5, 1, 2, 4};

        for (int i = 0; i < arr.length - 1; i++){
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println("First Duplicate Element in Array: "+arr[i]);
                    temp++;
                    break;
                }
            }
            if (temp > 0){
                break;
            }
        }

        // method, contains to check value is exist or not
        HashSet<Integer> set = new HashSet<>();
        int temp = -1;
        for (int i = arr.length - 1; i >= 0; i--){
            if (set.contains(arr[i])){
                temp = i;
            }else {
                set.add(arr[i]);
            }
        }
        if (temp != -1){
            System.out.println("First Duplicate Element present in Array: "+arr[temp]);
        }else {
            System.out.println("Element not found");
        }

    }
}
