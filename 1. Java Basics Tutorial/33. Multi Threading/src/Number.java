package LOCKS_6.Intrinstic_1;

public class Number {

    private int count = 0;

    public synchronized void increment(){
        count++;

    }

    public  int getCount(){
        return count;

    }
}
