package Topic1_Stream;

import java.util.Arrays;
import java.util.List;

public class S5_IntermediateStream {
    public static void main(String[] args) {

        /*
        Intermediate Stream: Intermediate operations are lazy (they don’t execute anything)

        Intermediate operations (like filter(), map())
        ➜ Only build the pipeline
        ➜ They return another stream
        ➜ No processing happens yet

        Intermediate operations define WHAT to do
         */

        List<Integer> list = Arrays.asList(2, 5, 8, 12);

        list.stream()
                .filter(n -> {
                    System.out.println("Filtering: " + n);
                    return n > 5;
                });  // ❌ No terminal operation

        // (No output)
    }
}
