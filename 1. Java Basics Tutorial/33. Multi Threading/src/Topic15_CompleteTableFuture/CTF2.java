package Topic15_CompleteTableFuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CTF2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

     CompletableFuture<String> future3 = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(2000);
                System.out.println(" Worker1 ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
            return " ck1 ";
        }).orTimeout(1, TimeUnit.SECONDS).exceptionally(s->"Time Out");

             //.thenApply(x->x+x);  // .get();

        System.out.println(future3.get());

    }
}
