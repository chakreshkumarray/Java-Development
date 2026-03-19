package Topic8_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {

        /*
        🔹 What is Stream API in Java?
        The Stream API (introduced in Java 8) is a set of classes and
        methods used to process collections of data in a functional, declarative way.

        👉 It allows you to filter, transform, and aggregate data without writing complex loops.
        🔥 One-Line Interview Definition
        👉 “Stream API is used to process data in a pipeline using functional programming concepts
           like filter, map, and reduce.”

         🔹 Key Idea
            Instead of:
            writing loops
            managing temporary variables
            You create a pipeline of operations:
            Collection → Stream → Operations → Result
         */

        List<Integer> list = Arrays.asList(5, 12, 8, 20);

        List<Integer> result = list.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
