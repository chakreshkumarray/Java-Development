package Topic1_WhyGeneric;
import java.util.ArrayList;

public class Problem {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("hello");
        list.add(123);
        list.add(3.14);
        list.add('c');

        /* problem
        *Above code has 3 major issues

           No Type safety
           Manual casting
           No Compile Time checking
         */

        String str = (String) list.get(0);
        String integer = (String) list.get(1);
        
    }
}
