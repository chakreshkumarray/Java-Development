public class A22_FindMissingElement {
    public static void main(String[] args) {

        // Find missing element in array

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 9, 10};

        // method 1
        int expect_num = arr.length + 1;
        int total_sum = expect_num * (expect_num + 1) / 2;

        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        System.out.println("Missing number is: "+(total_sum - sum));

        // method 2 XOR

        int[] arr1 = {1, 2, 3, 4, 5, 6, 8, 9, 10};

        int xor = arr1[0];
        for (int i = 1; i < arr1.length; i++){
            xor = xor ^ arr1[i];
        }

        int xor1 = 1;
        for (int i = 2; i <= (arr1.length + 1); i++){
            xor1 = xor1 ^ i;
        }
        System.out.println("Missing Element is : "+(xor ^ xor1));
    }
}
