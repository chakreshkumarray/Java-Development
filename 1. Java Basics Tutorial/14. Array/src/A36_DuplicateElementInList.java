import java.util.ArrayList;
import java.util.List;

public class A36_DuplicateElementInList {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 3, 1, 2};

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++){
            if (list.contains(arr[i])){
                System.out.println("Duplicate Element: "+arr[i]);
            }else {
                list.add(arr[i]);
            }
        }
    }
}
