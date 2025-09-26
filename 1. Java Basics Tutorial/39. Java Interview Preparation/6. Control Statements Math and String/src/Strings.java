public class Strings {
    public static void main(String[] args) {
        String str1 = "Ck";
        String str2 = "CK";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.toString());
        System.out.println(str1.equals(str2));
        System.out.println(str1.split(str2));
        System.out.println(str1.isBlank());
    }
}
