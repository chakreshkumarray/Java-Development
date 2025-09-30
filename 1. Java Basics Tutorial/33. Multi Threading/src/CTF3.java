package CompleteTableFuture_15;
import java.util.concurrent.Executors;
import java.util.concurrent.*;

public class CTF3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Executor executor = Executors.newFixedThreadPool(3);
        CompletableFuture<String> future4 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
                System.out.println(" Worker1 ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
            return " ck1 ";
        },executor ).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"Time Out");

        //.thenApply(x->x+x);  // .get();

        System.out.println(future4.get());
    }
}
