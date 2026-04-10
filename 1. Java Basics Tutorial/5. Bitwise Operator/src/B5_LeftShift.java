public class B5_LeftShift {
    public static void main(String[] args) {

        int a = 12;
        int b = a << 1; // <----------

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }
}
/*
Left Shift (<<)

Shifts bits to the left
Adds zeros on the right
Equivalent to multiplying by 2

Example:

5 << 1
101 → 1010 = 10

👉 Result = 10

 */