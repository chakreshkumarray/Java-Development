package Topic16_CyclicBarrier;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;


public class Dependent implements Callable<String> {

        private final java.util.concurrent.CyclicBarrier match ;

        public Dependent(java.util.concurrent.CyclicBarrier match){
            this.match = match;
        }

        public String call() throws Exception {
            try {
                System.out.println(Thread.currentThread().getName() + " Service started..");
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " Waiting for Thread..");
                match.await();

            }finally {
                match.await(200, TimeUnit.SECONDS);
            }
            return "ck";
        }
}

