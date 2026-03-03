public class A15_DuplicateElementOccurrence {
    public static void main(String[] args) {

        // Occurrence of Duplicate element
        int[] arr = {41, 46, 61, 46, 14, 62, 66, 14, 46};

        int occurrence = 0;
        for (int i = 0; i <arr.length; i++){
            for (int j = i +1; j <arr.length; j++){
                if (arr[i] == arr[j]){
                    occurrence++;
                }
            }
        }
        System.out.println(occurrence);
    }
}
