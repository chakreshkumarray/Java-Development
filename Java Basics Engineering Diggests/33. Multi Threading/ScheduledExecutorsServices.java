package Executors_Framework_14.ExecutorMethod;
import java.util.concurrent.Executors;
import java.util.concurrent.*;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduledExecutorsServices {
    public static void main(String[] args) {

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(()-> System.out.println("schedule done after 5 second"),5,TimeUnit.SECONDS);
        scheduler.shutdown();

        // scheduleAtFixedRate
        scheduler.scheduleAtFixedRate(()-> System.out.println("Fixed Rate done 4 second"),
                5,5,TimeUnit.SECONDS);
        scheduler.schedule( () -> {
            System.out.println("Initial shutdown...");
            scheduler.shutdown();
        },20,TimeUnit.SECONDS);

        // scheduleWithFixedDelay
        scheduler.scheduleWithFixedDelay(() -> System.out.println("Delay done 3 second"),
                5,5,TimeUnit.SECONDS);
        scheduler.schedule( () -> {
            System.out.println("Initial shutdown...");
            scheduler.shutdown();
        },20,TimeUnit.SECONDS);

    }
}
