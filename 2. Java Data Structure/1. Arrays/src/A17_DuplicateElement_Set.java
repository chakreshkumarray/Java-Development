import java.util.HashSet;
import java.util.Set;

public class A17_DuplicateElement_Set {
    public static void main(String[] args) {

        // Find Duplicate Element in Array by Using Set Interface
        // Set don't allow duplicate element
        // This use where element repeat only one time otherwise it will through error.

        int[] arr = {3, 5, 4, 3, 2, 2, 1};

        Set<Integer> s = new HashSet<>();

        for (int number : arr){

            if (s.add(number) == false){

                System.out.println(number);
            }
        }

    }
}
