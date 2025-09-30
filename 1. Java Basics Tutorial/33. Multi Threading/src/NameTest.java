package How_Create_Threads_1.Method_2;

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
