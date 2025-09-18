public class Topic2_StringMethods {
    public static void main(String[] args) {

        // String Equality Check
        String name1 = "ck kumar";
        String name2 = "Ck kumar";
        System.out.println(name1.equals(name2));

        // Ignore case in String
        String name3 = "CK kumar";
        String name4 = "ck kumar";
        System.out.println(name3.equalsIgnoreCase(name4));

        // Compare to Methods check character lexico graphically
        String str1 = "pka";
        String str2 = "AkCK";
        System.out.println('p'+0);
        System.out.println('A'+0);
        System.out.println(str1.compareTo(str2));

        String name = "Chakresh";
        String name0 = "Chakresh";
        System.out.println('C'+0);
        System.out.println('C'+0);
        System.out.println(name.compareTo(name0));

        String myName1 = "Chakresh";
        String myName2 = "Chekresh";
        System.out.println('a'+0);
        System.out.println('e'+0);
        System.out.println(myName1.compareTo(myName2));

        // compare to Ignore Case
        String a = "Errdsa";
        String b = "errdsa";
        System.out.println(a.compareToIgnoreCase(b));

        // Integer to String
        int a1 = 10;

        System.out.println(String.valueOf(a1));

        // substring and subsequence
        String name5 = "Chakresh Kumar ray";
        System.out.println(name5.substring(2,12));
        System.out.println(name5.subSequence(2,12));

        String name6 = "Ck Ray...";

        System.out.println(name6.length());
        System.out.println(name6.charAt(2));

        // String Empty
        String name7 = "";
        System.out.println(name7.isEmpty());

        String a5 = " ";
        System.out.println(a5.isEmpty());

        String b5 = "Ck..";
        System.out.println(b5.isEmpty());

        // space ignore
        String c = "   ";
        System.out.println(c.isBlank());

        // index finds
        String myName="Chakresh Kumar";
        System.out.println(myName.indexOf("a"));
        System.out.println(myName.lastIndexOf("k"));
        System.out.println(myName.indexOf('C'));
        System.out.println(myName.indexOf('k',2));

        // Sub Strings
        // Find Substring of string
        String name8 = "chakresh kumar   ";
        System.out.println(name8.substring(4));
        System.out.println(name8.substring(9,12));

        // uppercase
        System.out.println(name8.toUpperCase());

        // lowercase
        System.out.println(name8.toLowerCase());

        // Remove space
        System.out.println(name8.trim());

        // Replace
        System.out.println(name8.replace("kumar","ray"));

        // contains
        System.out.println(name8.contains("cha"));
        System.out.println(name8.contains("kum"));
        System.out.println(name8.contains("fssffe"));
        System.out.println(name8.contains("C"));

        // Start With
        System.out.println(name8.startsWith("ch"));
        System.out.println(name8.startsWith("ku"));

        // Ends With
        System.out.println(name8.endsWith(" "));

    }
}
