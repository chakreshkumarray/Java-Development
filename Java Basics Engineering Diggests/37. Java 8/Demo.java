package Collector;
import java.util.*;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {

        // 1. Collecting to a list
        List<String> names = Arrays.asList("Chakra","Ambushers","Dheeraj");
        List<String> res = names.stream().filter(x-> x.startsWith("C")).toList();
        System.out.println(res);

        // 2. Collecting to a set
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8);
        Set<Integer> set = num.stream().collect(Collectors.toSet());
        System.out.println(set);

        // 3. Collecting to a specific collection
        ArrayDeque<String> collect =  names.stream().collect(Collectors.toCollection(()->new ArrayDeque<>()));
        System.out.println(collect);

        // 4. Joining Strings
        String collect1 = names.stream().map(String::toUpperCase).collect(Collectors.joining(", "));
        System.out.println(collect1);

        // 5. Summarizing Data
        List<Integer> numbers = Arrays.asList(2,5,9,4,7,6);
        IntSummaryStatistics state = numbers.stream().collect(Collectors.summarizingInt(x -> x));
        System.out.println("Count : "+state.getCount());
        System.out.println("Sum : "+state.getSum());
        System.out.println("Min : "+state.getMin());
        System.out.println("Average : "+state.getAverage());
        System.out.println("Max : "+state.getMax());

        // 6. Calculating Average
        Double average = numbers.stream().collect(Collectors.averagingDouble(x -> x));
        System.out.println("Average is : "+average);

        // 7. Counting Elements
        Long count = numbers.stream().collect(Collectors.counting());
        System.out.println("Count is : " +count);

        // 8. Grouping Elements
        List<String> words = Arrays.asList("Chakra","Ambushers","Dheeraj","Shiva");
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.joining(","))));
        System.out.println(words.stream().collect(Collectors.groupingBy(String::length,Collectors.counting())));
        System.out.println(String.valueOf(words.stream().collect(Collectors.groupingBy(String::length, TreeMap:: new, Collectors.counting()))));

        // 9. Partition Elements
        System.out.println(words.stream().collect(Collectors.partitioningBy(x -> x.length()>5)));
        

    }
}
