package Topic1_Stream;

import java.util.ArrayList;
import java.util.List;

public class S1_WhyStream {
    public static void main(String[] args) {

        /*
        A Stream in Java is a feature introduced in Java 8 that allows you to
        process collections of data (like lists, arrays, etc.) in a functional and efficient way.

        Definition: A Stream is a sequence of elements that supports operations
                    like filtering, mapping, and reducing to process data.


         */

        // Before stream
        List<Integer> list = new ArrayList<>();
        for (Integer num : list) {
            if (num > 10) {
                System.out.println(num);
            }
        }

        // With(After) Stream
        list.stream()
                .filter(n -> n > 10)
                .forEach(System.out::println);
    }
}
