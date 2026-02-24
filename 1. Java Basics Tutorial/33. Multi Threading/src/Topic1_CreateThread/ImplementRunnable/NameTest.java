package Topic1_CreateThread.ImplementRunnable;

public class NameTest {
    public static void main(String[] args) {

        Name name = new Name();
        Thread t1 = new Thread(name);
        t1.start();
        
        for (; ; ){
            System.out.println("Chakra");
        }

    }
}
