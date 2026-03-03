public class A16_DuplicateElement_Brute_Force_Method {
    public static void main(String[] args) {

        // Find Duplicate Element in Array Using Brute Force Method
        // This use where element repeat only one time otherwise it will through error.
        int[] arr = {3, 5, 4, 3, 2, 2, 1};

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if ((arr[i] == arr[j]) && (i != j)){
                    System.out.println("Duplicate Element is: "+arr[j]);
                    break;
                }
            }
        }
    }
}
