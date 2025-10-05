package List.CopyOnWriteArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProgramE {
    public static void main(String[] args) {
      //  List<String> sharedList = new ArrayList<>();  // Problem Thread-safe Exception generated
        List<String> sharedList = new CopyOnWriteArrayList<>(); // Solution
        sharedList.add("item1");
        sharedList.add("item2");
        sharedList.add("item3");

        Thread reader = new Thread(()->{
            try {
                while (true){
                    for (String item :sharedList){
                        System.out.println("Reading item : "+item);
                        Thread.sleep(100);
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Exception in reader thread : "+ e);
            }
        });

        Thread writer = new Thread(()->{
            try {
                Thread.sleep(500);
                sharedList.add("item4");
                System.out.println("Added item4 to the list.");

                Thread.sleep(500);
                sharedList.remove("item1");
                System.out.println("Removed item1 from the list.");
            } catch (InterruptedException e){
               e.printStackTrace();
            }
        });

        reader.start();
        writer.start();

    }
}
