public class A5_Shorthand_Operator {
    public static void main(String[] args) {

        int a = 10;
        a += 1;      // a=a+1;
        System.out.println(a);

        int b = 12;
        b -= 2; // b=b-2;
        System.out.println(b);

        int c = 24;
        c *= 5;  // c=c*5;
        System.out.println(c);

        int d = 23;
        d /= 3;  // d=d/3;
        System.out.println(d);

        int e = 31;
        e %= 5;  // e=e%5;
        System.out.println(e);

        byte f = 10;
        f = (byte) (f+5); // a+=5;
        System.out.println(f);

    }
}
