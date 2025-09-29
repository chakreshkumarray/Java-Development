package Loop;

public class Ch64_Occurrence {
    public static void main(String[] args) {

        int[] arr = {14,49,14,31,65,23,49,32,14};
        int occ = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 14){
                occ++;
            }
        }
        System.out.println("Number of occurrence is: "+occ);
    }
}
