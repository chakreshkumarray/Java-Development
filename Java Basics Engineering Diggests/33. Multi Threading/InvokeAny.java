package Executors_Framework_14.ExecutorMethod;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.*;

public class InvokeAny {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable callable1 = () ->{
            System.out.println("ck 1");
            Thread.sleep(1000);
            return 1;
        };
        Callable callable2 = () -> {
            Thread.sleep(1000);
            System.out.println("ck 2");
            return 2;
        };
        Callable callable3 = () -> {
            System.out.println("ck 3");
            return 3;
        };
        List<Callable<Integer>> lists = Arrays.asList(callable1,callable2,callable3);
        Integer i =  executorService.invokeAny(lists);
        System.out.println(i);
        executorService.shutdown();
        System.out.println("Chakresh");

    }
}
