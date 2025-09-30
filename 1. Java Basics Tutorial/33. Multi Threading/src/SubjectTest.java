package Thread_LifeCycle_2;

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
