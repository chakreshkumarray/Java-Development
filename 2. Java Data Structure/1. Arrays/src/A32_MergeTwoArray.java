public class A32_MergeTwoArray {
    public static void main(String[] args) {

        // Merge to array in single array

        int[] arr1 = {10, 20, 30};
        int[] arr2 = {40, 50, 60, 70, 80};

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                merged[i] = arr1[i];
                merged[arr1.length + j] = arr2[j];
            }
        }

        for (int i : merged){
            System.out.println(i);
        }

    }
}
