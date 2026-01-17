package Topic14_ExecutorsFramework.Topic1_ExecutorMethod;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPool {
    public static void main(String[] args){

                                   Executors.newFixedThreadPool(2);
        ExecutorService services = Executors.newCachedThreadPool();
    }
}
