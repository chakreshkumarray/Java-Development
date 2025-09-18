public class Equality_Check {
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
    }
}
