package Topic1_CreateThread.ExtendThread;

public class World extends Thread{

    @Override
    public void run() {
        for (; ;) {
            System.out.println("World");
          //  System.out.println(Thread.currentThread().getName());
        }
    }

}
