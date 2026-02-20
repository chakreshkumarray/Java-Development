public class B7_UnSignedRightShift {
    public static void main(String[] args) {

        int a = 17;
        int b = a >>> 2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));


        int c = -6;
        int d = c >>> 1;
        System.out.println(c);
        System.out.println(d);
        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(d));

    }
}
