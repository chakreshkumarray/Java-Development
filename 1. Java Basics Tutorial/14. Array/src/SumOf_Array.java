public class SumOf_Array  {
    public static void main(String[] args) {

        int[] arr={54,32,58,46,12,36,78,65,32};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
