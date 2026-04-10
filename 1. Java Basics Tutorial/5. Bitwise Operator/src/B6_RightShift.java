public class B6_RightShift {
    public static void main(String[] args) {

        int a = -8;
        int b = a >> 1; // ---------->

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));

    }
}
/*

6. Right Shift (>>)
Shifts bits to the right
Removes bits from the right
Equivalent to dividing by 2

Example:

5 >> 1
101 → 10 = 2

👉 Result = 2
 */