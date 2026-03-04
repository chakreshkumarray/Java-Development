public class A20_AppearsOneTime {
    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 5, 2, 3, 4};

        // by using XOR
        // commutative
        // associative

        int res = arr[0];
        for (int i = 1; i < arr.length; i++){
            res = res ^ arr[i];
        }
        System.out.println("Element Appeared one time in array: "+res);
    }
}
