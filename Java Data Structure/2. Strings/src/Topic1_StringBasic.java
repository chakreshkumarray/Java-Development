public class Topic1_StringBasic {
    public static void main(String[] args) {

        String a = "ck";  // Stored in String Pool as same memory location
        String b = "ck";  // Stored in String Pool as same memory location

        String c = new String("ck"); // Stored in Heap created object different address
        String d = new String("ck"); // Stored in Heap created object different address

        String x = "Ram";
        String y = new String("Ram");

        System.out.println(a == b); // Reference Checking not Equality
        System.out.println(c == d);  // Reference Checking not Equality
        System.out.println(x == y); // Reference Checking not Equality

        String name = "Ck Ray...";
        String address = new String("India"); // second method -> create object
        System.out.println(address);
        System.out.println(name);


    }
}