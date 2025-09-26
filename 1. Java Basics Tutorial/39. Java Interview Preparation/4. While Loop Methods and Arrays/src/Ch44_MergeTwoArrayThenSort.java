public class Ch44_MergeTwoArrayThenSort {
    public static void main(String[] args) {

        int[] arr1 = {48,14,71,41,94,76,59};
        int[] arr2 = {98,49,37,85,72,12,31};

        int[] merged = new int[arr1.length+arr2.length];

        // Merge Array
        for (int i = 0; i < arr1.length;i++){
            for (int j = 0; j < arr2.length; j++){
                merged[i] = arr1[i];
                merged[arr1.length + j] = arr2[j];
            }
        }

        for (int i = 0; i < merged.length; i++){
            System.out.print(merged[i]+" ");
        }

        // Sort Array
        for (int i = 0; i < merged.length-1; i++){
            for (int j = i+1; j < merged.length; j++){
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }

        for (int i = 0; i< merged.length; i++){
            System.out.print(merged[i]+" ");
        }
    }
}
