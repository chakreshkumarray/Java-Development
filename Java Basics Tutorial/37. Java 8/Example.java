package Collector;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Example {
    public static void main(String[] args) {

        // Example 1 : Collecting Names by Length
        List<String> l1 = Arrays.asList("Anna","Bob","Alexander","Brain","Alicea");
        System.out.println(l1
                .stream()
                .collect(Collectors
                .groupingBy(String
                ::length)));

        // Example 2: Counting word Occurrence
        String sentence = "Hello Chakra Kumar Ray From Sultana";
        System.out.println(Arrays
                .stream(sentence.split(" "))
                .collect(Collectors.groupingBy(x -> x,
                Collectors.counting())));

        // Example 3 : Partition Even and Odd Numbers
        List<Integer> l2 = Arrays.asList(1,2,3,4,5,6);
        System.out.println(l2.stream()
                .collect(Collectors
                .partitioningBy(x -> x % 2 == 0)));

        // Example 4 : Summing Values in a Map
        Map<String,Integer> items = new HashMap<>();
        items.put("Apple",10);
        items.put("Banana",20);
        items.put("Orange",15);
        System.out.println( items.values().stream().reduce(Integer::sum));
        System.out.println(items.values().stream().collect(Collectors.summingInt(x->x)));

        // Example 5 : Creating a Map from Stream Elements
        List<String> fruits = Arrays.asList("Apple","Banana","Cherry");
        System.out.println(fruits.stream().collect(Collectors
                .toMap(x -> x.toUpperCase(),x -> x.length())));

        // Example 6 :  To Map
        List<String> word = Arrays.asList("apple","banana","apple","orange","banana","apple");
        System.out.println(word.stream().collect(Collectors
                .toMap(k->k,v->1,
                        Integer::sum)));


    }
}
