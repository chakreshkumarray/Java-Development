package CompleteTableFuture_15;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CTF {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future =  CompletableFuture.supplyAsync( () -> {
            try {
                Thread.sleep(200);
                System.out.println(" Worker ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
            return " ck ";
        });

        String s = future.get();
        System.out.println(s);
        System.out.println(" Main ");
    }
}
