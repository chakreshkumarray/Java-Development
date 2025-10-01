package Topic2_ThreadLifeCycle;

public class SubjectTest {
    public static void main(String[] args) {

        Subject subject = new Subject(); // New State

        Thread t2 = new Thread(subject);
        t2.start();                      // Runnable state

       for (; ; ){
           System.out.println("Hindi"); // waiting
       }

    }
}
