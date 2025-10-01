package Topic1_CreateThread.ImplementRunnable;

public class Name implements Runnable{

    @Override
    public void run(){    // running
        for (; ; ){
            System.out.println("Kumar");
        }
    }

}
