package Topic9_DeadLock;

public class DeadLock {
    public static void main(String[] args) {

        Pen pen = new Pen();
        Paper paper = new Paper();

        Thread t1 = new Thread(new Task1(pen,paper),"Thread 1");
        Thread t2 = new Thread(new Task2(pen,paper),"Thread 2");

        t1.start();
        t2.start();
    }
}
/*
🔹 What is Deadlock?
    Deadlock is a situation where two or more threads are stuck forever waiting for each other.

🔹 Simple Meaning
   You wait for me, I wait for you → no one moves

🔹 Conditions for Deadlock (VERY IMPORTANT)

All 4 must happen:

1. Mutual Exclusion
   Resource used by only one thread at a time

2. Hold and Wait
   Thread holds one lock and waits for another

3. No Preemption
   Lock cannot be forcibly taken

4. Circular Wait
   Threads form a cycle of waiting

🔹 How to Prevent Deadlock?
 1. Lock Ordering (Best Method)
    Always acquire locks in same order

 2. Use Try-Lock (Advanced)
    Avoid waiting forever

 3. Reduce Nested Locks
    Keep locking simple

 4. Timeout Mechanism
    Stop waiting after some time

🔹 Detection (Real World)
   Tools:
   Thread dump
   Profilers
   Monitoring tools
 */

