package How_Create_Threads_1.Method_2;

public class Name implements Runnable{

    @Override
    public void run(){    // running
        for (; ; ){
            System.out.println("Kumar");
        }
    }

}
