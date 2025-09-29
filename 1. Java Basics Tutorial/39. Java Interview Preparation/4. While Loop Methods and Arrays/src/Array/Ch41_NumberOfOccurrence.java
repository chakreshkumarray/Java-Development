package Array;

public class Ch41_NumberOfOccurrence {
    public static void main(String[] args) {

        int[] arr = {79,41,31,41,93,41,16,32,84,41,31};

        int occurrence = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 41){
                occurrence++;
            }
        }
        System.out.println("Number of occurrence is: "+occurrence);
    }
}
