package Array;

public class Ch46_ArrayIsPalindrome {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3,2, 1};
        boolean isPalindrome = true;
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            if (arr[i] != arr[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("A2_Array is Palindrome");
        } else {
            System.out.println("A2_Array is NOT Palindrome");
        }

    }
}

