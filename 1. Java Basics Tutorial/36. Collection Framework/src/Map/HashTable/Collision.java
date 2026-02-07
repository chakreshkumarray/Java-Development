package Map.HashTable;
import java.util.Hashtable;

public class Collision {
    public static void main(String[] args) {
        Hashtable<Integer,String> map = new Hashtable<>();

        // Problem -->  get is synchronized --> Locked
        Thread t1 = new Thread(()->{
            for (int i = 0; i<1000; i++){
                map.put(i,"Thread1");
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 1000; i<2000; i++){
                map.put(i,"Thread1");
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Size of Map is : " +map.size());
    }
}
