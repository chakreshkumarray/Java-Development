import java.util.Locale;

public class SubStrings {
    public static void main(String[] args) {

        // Find Substring of string
        String name="chakresh kumar   ";
        System.out.println(name.substring(4));
        System.out.println(name.substring(9,12));

        // uppercase
        System.out.println(name.toUpperCase());

        // lowercase
        System.out.println(name.toLowerCase());

        // Remove space
        System.out.println(name.trim());

        // Replace
        System.out.println(name.replace("kumar","ray"));

        // contains
        System.out.println(name.contains("cha"));
        System.out.println(name.contains("kum"));
        System.out.println(name.contains("fssffe"));
        System.out.println(name.contains("C"));

        // Start With
        System.out.println(name.startsWith("ch"));
        System.out.println(name.startsWith("ku"));

        // Ends With
        System.out.println(name.endsWith(" "));


    }
}
