package Topic6_Lock.Topic1_Implicit;

public class Number {

    private int count = 0;

    public synchronized void increment(){
        count++;

    }

    public  int getCount(){
        return count;

    }
}
/*
🔹 What is Implicit Lock?
An implicit lock is a lock that Java automatically provides when you use the synchronized keyword.
   You don’t create or manage the lock manually — Java handles it internally.

🔹 Where is it used?
In synchronized methods
In synchronized blocks
 */