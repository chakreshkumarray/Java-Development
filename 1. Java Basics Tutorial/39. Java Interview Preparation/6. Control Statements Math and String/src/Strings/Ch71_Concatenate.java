package Strings;
import java.util.Scanner;
public class Ch71_Concatenate {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String:");
        String str1 = input.next();
        System.out.print("Enter string: ");
        String str2 = input.next();

        System.out.println(str1.concat(str2));

        System.out.println(str1.equals(str2));

        System.out.println(str1.toUpperCase());

    }
}
