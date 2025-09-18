package Executors_Framework_14.ExecutorMethod;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class CachedThreadPool {
    public static void main(String[] args) {

                                          Executors.newFixedThreadPool(2);
        ExecutorService executorService = Executors.newCachedThreadPool();

    }
}
