package Supplier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LazyEvaluationDemo {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Chakra","Ambre ssh","Dheeraj","Shiva","Anil");
        Stream<String> str = list.stream().filter(name ->{
            System.out.println("Filtering : " +name);
            return name.length()>3;
        });
        System.out.println("Before Terminal Operation");

        List<String> result = str.collect(Collectors.toList());
        System.out.println("After Terminal Operation");
        System.out.println(result);


    }
}
