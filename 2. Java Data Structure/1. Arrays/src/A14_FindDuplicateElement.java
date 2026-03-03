public class A14_FindDuplicateElement {
    public static void main(String[] args) {

        // Find Duplicate Element
        int[] arr = {41, 46, 61, 46, 14, 62, 66, 14, 46};

        for(int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println("Duplicate Element: "+arr[i]);
                }
            }

        }

    }
}
