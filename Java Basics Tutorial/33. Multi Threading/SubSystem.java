package Executors_Framework_14.CyclicBarrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class SubSystem implements Runnable{
        private final String name;
        private final java.util.concurrent.CyclicBarrier barrier;
        private final int initializationTime;

        public SubSystem(String name , int initializationTime , CyclicBarrier barrier){
            this.name =name;
            this.barrier = barrier;
            this.initializationTime = initializationTime;
        }

        @Override
        public void run() {
            try {
                System.out.println( name + " Initialization Started..");
                Thread.sleep(initializationTime);
                System.out.println(name + " Initialization completed ..");
                barrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                throw new RuntimeException(e);
            }
        }
}
