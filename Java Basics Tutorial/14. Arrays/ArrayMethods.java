import java.util.Arrays;

public class ArrayMethods {
    public static void main(String[] args) {

        int [] arr={2,7,9,3,6,4};
        System.out.println(arr); // not able to access

        // Access by for loop
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        // Array Traversal by Another type of loop
        int[] array={15,20,35,57,65,71};
        for (int i : array) {
            System.out.println(i);
        }
    }
}
