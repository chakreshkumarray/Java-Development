public class SumOfArray {
    public static void main(String[] args) {

        int[] array = {2,3,4,5,6};
        int a = SumArray(array);
        System.out.println(a);

    }
    public static int SumArray(int[] arr){
      int Sum = 0;
        for (int i : arr) {
            Sum = Sum + i;
        }
      return Sum;
    }


}