public class V8_TypeCasting {
    public static void main(String[] args) {

        long big = 45;  //implicit conversion
        float dec = 3;
        double de = 34.4;
        System.out.println(big);
        System.out.println(dec);
        System.out.println(de);

        float eDec = (float)3.4;  //explicit conversion
        long eLong = (long)5.6;
        int eInt = (int)5.8;
        System.out.println(eDec);
        System.out.println(eLong);
        System.out.println(eInt);

        int a = 10; // 4 bytes
        long b = a; // 8 bytes
        float c = a; // 4 bytes
        double d = c;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        float f = 1.7f;
        int g = (int)f;
        System.out.println(f);
        System.out.println(g);
    }
}
/*
Q. What is type casting?
Ans. Type casting means converting one data type into another data type.
     To convert data from one type to another
     To avoid errors
     To perform operations between different data types

     1. Implicit Casting (Widening)
         Done automatically by Java
         Converts smaller → larger type
         No data loss
         byte → short → int → long → float → double

         int a = 10;
         double b = a;           int → double (automatic)
         System.out.println(b);  10.0

     2. Explicit Casting (Narrowing)
         Done manually by programmer
         Converts larger → smaller type
         May cause data loss

         double d = 10.75;
         int x = (int) d;          double → int
         System.out.println(x);    10 (decimal lost)
 */
