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
