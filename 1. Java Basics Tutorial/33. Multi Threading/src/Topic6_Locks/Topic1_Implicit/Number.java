package Topic6_Locks.Topic1_Implicit;

public class Number {

    private int count = 0;

    public synchronized void increment(){
        count++;

    }

    public  int getCount(){
        return count;

    }
}
