package Array;

public class Ch47_MergeTwoArray {
    public static void main(String[] args) {

        int[] arr1 = {15,95,13,43,72};
        int[] arr2 = {98,22,69,44,16};

        int[] merged = new int[arr1.length+arr2.length];

        for (int  i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                merged[i] = arr1[i];
                merged[arr1.length+j] = arr2[j];
            }
        }
        for (int i = 0; i< merged.length;i++){
            System.out.print(merged[i]+" ");
        }

    }
}
