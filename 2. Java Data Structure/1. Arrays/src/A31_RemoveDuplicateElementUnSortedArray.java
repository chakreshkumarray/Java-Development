import java.util.HashSet;

public class A31_RemoveDuplicateElementUnSortedArray {
    public static void main(String[] args) {

        // Remove Duplicate Element from Unsorted Array

        int[] arr = {1, 2, 3, 2, 5, 4, 5};

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        for (int j : set){
            System.out.println(j);
        }

    }
}
