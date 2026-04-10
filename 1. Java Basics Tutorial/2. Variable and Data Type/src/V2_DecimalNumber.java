public class V2_DecimalNumber {
    public static void main(String[] args) {

        float result = 122222222222222222222.5555511111111111111111115f;
        System.out.println(result);
        System.out.println(Float.MIN_VALUE);
        System.out.println(Float.MAX_VALUE);

        double result0 = 12222222222222556452522222.55555111111111111144444444445;
        System.out.println(result0);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);
    }
}
/*
Q. What is Float and Double Data types?
Ans. These are used to store decimal (fractional) numbers.
     1. Float
        Size: 4 bytes (32 bits)
        Precision: ~6–7 decimal digits
        Must use f or F at the end
        Example: float f = 3.14f;

     2. Double
        Size: 8 bytes (64 bits)
        Precision: ~15–16 decimal digits
        No suffix needed
        Example: double d = 3.14159265359;
 */