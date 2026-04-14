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
/*
🔹 What is Synchronization?
Ans. Synchronization is a way to control multiple threads so that only one thread accesses shared data at a time.

🔹 Simple Meaning
Ans. “Only one thread can use this resource at a time.”
 */