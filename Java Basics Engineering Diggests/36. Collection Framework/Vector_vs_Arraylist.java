package List.Vector;
import java.util.ArrayList;
import java.util.Vector;

public class Vector_vs_Arraylist {
    public static void main(String[] args) throws InterruptedException {

       // ArrayList<Integer> list = new ArrayList<>(); // Problem
        Vector<Integer> list = new Vector<>();   // Thread-Safe Solution

        Thread t1 = new Thread(()->{
            for (int i = 0; i<1000; i++){
                list.add(i);
            }
        });

        Thread t2 = new Thread(()->{
            for (int i  = 0; i<1000; i++){
                list.add(i);
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Size of list " +list.size());
        /*
        Without vector(ArrayList) output different : 1723,1942,.,.,.,.
        With Vector output same : 2000
         */

    }
}
