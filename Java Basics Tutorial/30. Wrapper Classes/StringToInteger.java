package Wrapper_Class;

public class StringToInteger {
    public static void main(String[] args) {
        Integer a = 12;
        Integer b = 13;
        System.out.println((a+b));

        System.out.println(Integer.max(12,23));

        System.out.println(Integer.min(86,90));

        System.out.println(Integer.toBinaryString(123));

        String str = "123";
        Integer i = Integer.valueOf(str);
        System.out.println(i);

    }
}
