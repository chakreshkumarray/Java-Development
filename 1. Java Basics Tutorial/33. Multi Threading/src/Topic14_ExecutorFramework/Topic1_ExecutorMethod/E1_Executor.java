package Topic14_ExecutorFramework.Topic1_ExecutorMethod;
import java.util.concurrent.Executors;

public class E1_Executor {
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
/*
🔹 What is E1_Executor?
 E1_Executor is an interface used to manage and run threads
without creating them manually.

Instead of: new Thread(...).start();

 You use E1_Executor: executor.execute(task);
🔹 Why Use E1_Executor?
✔ No need to manage threads manually
✔ Better performance (thread reuse)
✔ Cleaner and scalable code
 */