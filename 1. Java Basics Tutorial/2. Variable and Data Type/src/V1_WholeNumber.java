public class V1_WholeNumber {
    public static void main(String[] args) {

        byte age0 = -127;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(age0);

        short age1 = 32767;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(age1);

        int age2 = 2147483647;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age2);

        long age3 = 9223372036854775807l;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(age3);
    }
}