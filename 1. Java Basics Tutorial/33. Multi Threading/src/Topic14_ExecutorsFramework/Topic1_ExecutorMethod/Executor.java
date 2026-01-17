package Topic14_ExecutorsFramework.Topic1_ExecutorMethod;
import java.util.concurrent.Executors;

public class Executor {
    public static void main(String[] args) {

        java.util.concurrent.Executor executor = Executors.newFixedThreadPool(5);

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
