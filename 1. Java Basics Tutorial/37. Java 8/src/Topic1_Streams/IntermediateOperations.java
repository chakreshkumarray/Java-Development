package Topic1_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {

        // 1. Filter
        List<String> list = Arrays.asList("Ck","Hk","AK","DK");
        Stream<String> stream = list.stream().filter(x-> x.startsWith("A"));
        System.out.println(stream);
        // no filtering at this point
        long res = list.stream().filter(x->x.startsWith("A")).count();
        System.out.println(res);

        // 2. Map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. Sorted
        Stream<String> sorted = list.stream().sorted();
        Stream<String> sorted1 = list.stream().sorted((a, b) -> a.length() - b.length());

        // 4.  Distinct
        list.stream().filter(x->x.startsWith("A")).distinct().count();

        // 5. Limit
        Stream.iterate(1,x-> x + 1).limit(100);

        // 6. Skip
        Stream.iterate(1,x->x+1).skip(10).limit(100).count();

        // 7. Peek
        Stream.iterate(1,x ->x+1).skip(10).limit(100).peek(System.out::println).count();

        // 8. flatMap
        List<List<String>> lists = Arrays.asList(
                Arrays.asList("Apple","Banana"),
                Arrays.asList("Orange","Kiwi"),
                Arrays.asList("Pear","Grape")
        );
        System.out.println(lists.get(0).get(0));
        System.out.println(lists.stream().flatMap(x -> x.stream()).toList());
        System.out.println(lists.stream()
                .flatMap(x-> x.stream())
                .map(String::toUpperCase)
                .toList());

        List<String> sentences = Arrays.asList(
                "Hello Chakresh",
                "Java streams are powerful",
                "flatMap is useful"
        );
        System.out.println(sentences.stream()
                .flatMap(sent->Arrays.stream(sent.split(" ")))
                .toList());
        System.out.println(sentences.stream()
                .flatMap(sent->Arrays.stream(sent.split(" ")))
                .map(String::toUpperCase)
                .toList());

    }
}
