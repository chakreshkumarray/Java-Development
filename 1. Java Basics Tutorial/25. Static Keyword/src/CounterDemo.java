public class CounterDemo {

    // int count = 0;
    static int count = 0;

    CounterDemo(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {

        CounterDemo c1 = new CounterDemo();
        CounterDemo c2 = new CounterDemo();
        CounterDemo c3 = new CounterDemo();
    }
}
/*
🔷 1. What is static Keyword?
static means the member belongs to the class, not to objects.

2. Why Need?
Call Without Object

Q1: Why use static?
To share common data and methods across all objects
 */