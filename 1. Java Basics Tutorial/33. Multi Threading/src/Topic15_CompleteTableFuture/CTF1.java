package Topic15_CompleteTableFuture;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CTF1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        CompletableFuture<String> future1 =  CompletableFuture.supplyAsync( () -> {
            try {
                Thread.sleep(200);
                System.out.println(" Worker1 ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
            return " ck1 ";
        });
        String s1 = future1.get();
        System.out.println(s1);
        System.out.println(" Main1 ");

        CompletableFuture<String> future2 =  CompletableFuture.supplyAsync( () -> {
            try {
                Thread.sleep(1000);
                System.out.println(" Worker2 ");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } ;
            return " ok ";
        });
        String s2 = future1.get();
        System.out.println(s2);
        System.out.println(" Main2 ");

        CompletableFuture<Void> f = CompletableFuture.allOf(future1, future2);
        f.join();
        f.get();
        System.out.println(" Main ");

    }
}
