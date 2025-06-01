public class Narrowing_Conversion_OR_Explicit {
    public static void main(String[] args) {

        float eDec=(float)3.4;  //explicit conversion
        long eLong=(long)5.6;
        int eInt=(int)5.8;

        System.out.println(eDec);
        System.out.println(eLong);
        System.out.println(eInt);

        double doubleValue=123.897;
        float floatValue=(float)doubleValue; // Narrowing conversion from double to float
        long longValue=(long)4540.4111;
        int intValue=(int) 9.99;
        System.out.println(doubleValue);
        System.out.println(floatValue);
        System.out.println(longValue);
        System.out.println(intValue);

        long a=Long.MAX_VALUE; // 01111111 11111111 11111111 11111111 11111111 11111111 11111111 11111111
        System.out.println(a);

        int b=(int)a;  // 11111111 11111111 11111111 11111111
        System.out.println(b); // Output = -1

        // Binary print of number
        System.out.println(Integer.toBinaryString(89555));

        System.out.println(Long.toBinaryString(Long.MAX_VALUE));

        System.out.println(Integer.toBinaryString(-1));

    }
}
