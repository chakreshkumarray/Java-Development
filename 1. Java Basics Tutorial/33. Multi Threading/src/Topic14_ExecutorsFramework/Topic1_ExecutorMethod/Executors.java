package Topic14_ExecutorsFramework.Topic1_ExecutorMethod;
import java.util.concurrent.*;

public class Executors {
    public static void main(String[] args) {

        Executor executor = java.util.concurrent.Executors.newFixedThreadPool(5);

        executor.execute( () -> {
            System.out.println( factorial(7));
        }
        );

    }

    public static long factorial(int n){
        long result = 1;
        for (int i = 1; i <= n; i++){
            result =  result * i;
        }
        return result ;
    }



}
