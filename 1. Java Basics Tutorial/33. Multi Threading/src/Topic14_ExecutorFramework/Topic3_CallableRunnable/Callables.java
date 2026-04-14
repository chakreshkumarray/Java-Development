package Topic14_ExecutorFramework.Topic3_CallableRunnable;
import java.util.concurrent.Callable;

public class Callables implements Callable {

    @Override
    public Object call() throws Exception {
        //Thread.sleep(500);
        return null;
    }
}
/*🔹 1. Runnable:
 Runnable is an interface used to create a thread
✔ Method: public void run();
✔ Features:
❌ No return value
❌ Cannot throw checked exceptions


🔹 2. Callable:
 Callable is an interface used when you need a result
✔ Method: public V call() throws Exception;
✔ Features:
✅ Returns value
✅ Can throw checked exceptions

 */