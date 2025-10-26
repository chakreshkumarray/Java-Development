package To_2_WrapperClasses;

import java.util.Date;

public class WrapperClass {
    public static void main(String[] args) {

        Integer first = Integer.valueOf("5");
        Integer first1 = 55;
        System.out.println(first);
        System.out.println(first1);

        Byte second = Byte.valueOf("10");
        System.out.println(second);

        Short third = (short) Byte.parseByte(String.valueOf(1));
        System.out.println(third);

        Long four = 54545L;
        System.out.println(four);

        Float five = 455.5f;
        System.out.println(five);

        Double six = Double.valueOf("445");
        System.out.println(six);

        Character seven = 'c';
        System.out.println(seven);

        Boolean eight = Boolean.TRUE;
        System.out.println(eight);

    }
}
