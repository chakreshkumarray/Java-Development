package SynChronization_5;

public class Counter {

    private int count = 0;

    public synchronized void increment(){  // Critical Section
            count++;

    }

    public  int getCount(){
        return count;

    }

}
