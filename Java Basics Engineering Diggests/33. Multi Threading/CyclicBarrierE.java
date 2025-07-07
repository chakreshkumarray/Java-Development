package Executors_Framework_14.CyclicBarrier;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierE {
    public static void main(String[] args) {

        int numberSubSystem = 4;
        CyclicBarrier barrier = new CyclicBarrier(numberSubSystem, new Runnable() {
            @Override
            public void run() {
                System.out.println("All Sub System are Running , Started Completely ..");
            }
        });

        Thread webServerThread = new Thread(new SubSystem( "Web Server",2000,barrier));
        Thread databaseThread = new Thread(new SubSystem( "Database",3000,barrier));
        Thread chacheThread = new Thread(new SubSystem( "Cache",4000,barrier));
        Thread meassgeServiceThread = new Thread(new SubSystem( "Message Service",3500,barrier));

        webServerThread.start();
        databaseThread.start();
        chacheThread.start();
        meassgeServiceThread.start();
    }
}

