import java.util.HashSet;
public class A23_CommonElementTwoArray {
    public static void main(String[] args) {

        // Find Common Element in Two Array
        int[] arr1 = {4, 3, 7, 9, 2, 4};
        int[] arr2 = {5, 1, 4, 8, 3};

        // Method 1
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    hashSet.add(arr1[i]);
                    break;
                }
            }
        }
        for (int i : hashSet){
            System.out.println(i + " ");
        }

        // Method 2
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        for (int num1 : arr1){
            set1.add(num1);
        }
        for (int num2 : arr2){
            set2.add(num2);
        }
        for (int number : set2){
            boolean b = set1.add(number);
            if (b == false){
                System.out.println(number);
            }
        }
    }
}
