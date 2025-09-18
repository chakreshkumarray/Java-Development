package ParallelStreams;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();

        List<Integer> list = Stream.iterate(1, x -> x+1).limit(2000).toList();

        List<Integer> factorialList = list.parallelStream().map(ParallelStream::factorial).toList();

        long endTime = System.currentTimeMillis();
        System.out.println("Time taken with stream : "+(startTime-endTime)+"ms");
    }

    public static int factorial(int n){

        int result = 1;
        for (int i = 2; i <= n; i++){
            result = result*i;
        }
        return result;
    }
}
