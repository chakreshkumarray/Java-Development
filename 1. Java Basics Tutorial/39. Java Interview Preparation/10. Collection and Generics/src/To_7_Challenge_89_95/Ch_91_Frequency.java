package To_7_Challenge_89_95;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ch_91_Frequency {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,5,6,8,5,1,2,3,6,5,4,7,8,9,9,8,7,4,4,5,6,3,2,1);
        System.out.println(Collections.frequency(list,1));
        System.out.println(Collections.frequency(list,2));
        System.out.println(Collections.frequency(list,5));
        System.out.println(Collections.frequency(list,9));
    }
}
