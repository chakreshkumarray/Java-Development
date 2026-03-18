public class S8_Palindrome {
    public static void main(String[] args) {

        /* Check Given String is Palindrome or not */

        String str = "madam";
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--){
            reverse = reverse + str.charAt(i);
        }

        if (str.equals(reverse)){
            System.out.println("String is Palindrome");
        }else {
            System.out.println("String is not Palindrome");
        }
    }
}
