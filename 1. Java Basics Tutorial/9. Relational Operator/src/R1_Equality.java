public class R1_Equality {
    public static void main(String[] args) {

        int a = 15;
        int b = 20;

        String name = "Chakresh Kumar";
        String myName = "Chakresh Kumar";

        char c = 'C';
        char d = 'c';

        String name1 = new String("Chakresh Kumar");

        System.out.println(a == b); // check value case in integer
        System.out.println(myName == name); // check reference case of string

        System.out.println(name1 == myName);

        System.out.println('c' + 0);
        System.out.println('C' + 0);
        System.out.println(c == d);
    }
}
