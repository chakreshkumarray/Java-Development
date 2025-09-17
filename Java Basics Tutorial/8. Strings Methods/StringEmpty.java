public class StringEmpty {
    public static void main(String[] args) {

        String name="";
        System.out.println(name.isEmpty());

        String a=" ";
        System.out.println(a.isEmpty());

        String b="Ck..";
        System.out.println(b.isEmpty());

        // space ignore
        String c="   ";
        System.out.println(c.isBlank());

        // index finds
        String myName="Chakresh Kumar";
        System.out.println(myName.indexOf("a"));
        System.out.println(myName.lastIndexOf("k"));
        System.out.println(myName.indexOf('C',5,9));
        System.out.println(myName.indexOf('k',2));
    }
}
