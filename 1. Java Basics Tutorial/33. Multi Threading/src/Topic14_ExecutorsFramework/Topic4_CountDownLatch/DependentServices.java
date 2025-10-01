package Topic14_ExecutorsFramework.Topic4_CountDownLatch;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;


class DependentServices implements Callable<String> {

    private final CountDownLatch latch;
        public DependentServices(CountDownLatch latch)
        {
            this.latch = latch;
        }
        public String call() throws Exception {
            try {
                System.out.println(Thread.currentThread().getName() + " Service started..");
                Thread.sleep(2000);
            }finally {
                latch.countDown();
            }
            return "ck";
        }
}
