package Recursion;
import java.util.Scanner;
public class Ch69_Palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = input.next();
        System.out.println("Your are: " + (isPalindrome(str) ? "Palindrome" : "Not Palindrome"));
    }

    public static boolean isPalindrome(String str){
        if (str.length() <= 1){
            return true;
        }
        int lastPost = str.length()-1;
        if (str.charAt(0) != str.charAt(lastPost)){
            return false;
        }
        String newStr = str.substring(1,lastPost);

        return isPalindrome(newStr);
    }
}
