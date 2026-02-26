public class A9_Find_Minimum_Element {
    public static void main(String[] args) {

        int[] arr = {-16, -25, -51, -77, 80, -45, -39};
        int result = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){

            if(arr[i] < result){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
