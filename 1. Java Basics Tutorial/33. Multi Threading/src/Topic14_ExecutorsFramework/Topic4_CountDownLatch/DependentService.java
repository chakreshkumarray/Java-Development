package Topic14_ExecutorsFramework.Topic4_CountDownLatch;

import java.util.concurrent.Callable;

public class DependentService implements Callable<String> {

        public String call() throws Exception {
            System.out.println(Thread.currentThread().getName()+ " Service started..");
            Thread.sleep(2000);
            return "ck";
        }

    }

