package How_Create_Threads_1.Method_1;

public class World extends Thread{

    @Override
    public void run() {
        for (; ;) {
            System.out.println("World");
          //  System.out.println(Thread.currentThread().getName());
        }
    }

}
