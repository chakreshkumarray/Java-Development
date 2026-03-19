package Topic1_Stream;

import java.util.Arrays;
import java.util.List;

public class S6_TerminalStream {
    public static void main(String[] args) {

        /*
        Terminal Stream: terminal operations trigger the actual execution of the stream pipeline.

        Terminal operation (like forEach(), collect())
        ➜ Starts the execution
        ➜ Produces final result
        ➜ After this, stream is consumed

        Terminal operations actually DO it.
         */

        List<Integer> list = Arrays.asList(2, 5, 8, 12);
        list.stream()
                .filter(n -> {
                    System.out.println("Filtering: " + n);
                    return n > 5;
                })
                .forEach(System.out::println);

        /* (Output)
        Filtering: 2
        Filtering: 5
        Filtering: 8
        8
        Filtering: 12
        12
         */
    }
}
