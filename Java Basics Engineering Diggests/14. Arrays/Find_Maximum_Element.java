public class Find_Maximum_Element {
    public static void main(String[] args) {

        int[] arr={16,25,51,77,80,45,39};
        int result=0;
        for (int i=0; i<arr.length;i++){

            if(arr[i]>result){

                result=arr[i];

            }
        }
        System.out.println(result);

        // If Given negative value
        int[] arr1={-16,-25,-51,-77,-80,-45,-39};
        int result1=Integer.MIN_VALUE;
        for (int i=0; i<arr1.length;i++){

            if(arr1[i]>result1){

                result1=arr1[i];

            }
        }
        System.out.println(result1);
    }
}
