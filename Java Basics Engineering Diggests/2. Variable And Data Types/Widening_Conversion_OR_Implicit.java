public class Widening_Conversion_OR_Implicit {
    public static void main(String[] args) {

        byte byteValue=10; // 1 byte
        short shortValue=byteValue; // 2 bytes
        int intValue=shortValue;  // 4 bytes
        long longValue=intValue; // 8 bytes Widening conversion from int to long
        float floatValue=longValue; // 4 bytes Widening conversion from long to float
        double doubleValue=floatValue; // 8 bytes Widening conversion from float to double

        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(longValue);
        System.out.println(floatValue);
        System.out.println(doubleValue);

        char charValue='A'; // 2 bytes
        int intValueChar=charValue; // Widening conversion from char to int
        System.out.println(charValue);
        System.out.println(intValueChar);
    }
}
