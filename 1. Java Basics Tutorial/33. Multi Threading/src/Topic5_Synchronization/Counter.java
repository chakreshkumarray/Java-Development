package Topic5_Synchronization;

public class Counter {

    private int count = 0;

    public synchronized void increment(){  // Critical Section
            count++;

    }

    // OR synchronized block for one instance
    //     public void increment(){
    //     synchronized (this){
    //         count++;
    //     }
    // }

    public  int getCount(){
        return count;

    }

}
