public class B3_NOT {
    public static void main(String[] args) {

        int a = 15;
        int Not = ~a;
        System.out.println("Not is :"+Not);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(Not));

        int b = -25;
        int c = ~b;
        System.out.println("Not is :"+c);
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(c));
    }
}
/*
NOR (~)
Flips all bits (0 → 1, 1 → 0)

Example:

~5

Binary (assuming 32-bit system):

5  = 00000000 00000000 00000000 00000101
~5 = 11111111 11111111 11111111 11111010

~x = -(x + 1)

~5 = -(5 + 1) = -6
~10 = -(10 + 1) = -11
 */