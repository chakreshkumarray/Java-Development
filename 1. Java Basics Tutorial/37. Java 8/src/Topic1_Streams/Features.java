package Topic1_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Features {
    public static void main(String[] args) {

        // 1.  From Collection
        List<Integer> numbers = Arrays.asList(1,2,3,4);
        Stream<Integer> stream = numbers.stream();
        System.out.println(stream);

        // 2. From Arrays
        String[] array = {"A","B","C"};
        Stream<String> stream1 =Arrays.stream(array);
        System.out.println(stream1);

        // 3. Using Stream.of()
        Stream<Integer> stream2 = Stream.of(1,4,2,5,9);
        System.out.println(stream2);

        // 4. Infinite -> generate , iterate
        // Generate
        Stream<Integer> generate = Stream.generate(() -> 1);

        // Iterate
        List <Integer> collect =  Stream.iterate(1, x->x+1).limit(100).
                collect(Collectors.toList());
        System.out.println(collect);

    }
}
