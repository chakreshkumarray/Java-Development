package Topic2_ParallelStreams;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class CumulativeSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        AtomicInteger sum = new AtomicInteger(0);
        List<Integer> cumulativeSum = numbers.stream().map(sum::addAndGet).toList();
        System.out.println("Cumulative sum of given number : "+cumulativeSum);

    }
}
