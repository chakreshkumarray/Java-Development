public class Increment_and_Decrement {
    public static void main(String[] args) {

        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

        int p =1;
        int q = p + (++p);
        System.out.println(p);
        System.out.println(q);

        int d = 2 + (2*9);
        System.out.println(d);

        int c = 1;
        System.out.println(c++ + --c);

        double x = 1.5 , y = 2.5 , z = 3.5;
        double complexCalculation = (x+y) * (z-y) / (x+z);
        System.out.println(complexCalculation);
    }
}
