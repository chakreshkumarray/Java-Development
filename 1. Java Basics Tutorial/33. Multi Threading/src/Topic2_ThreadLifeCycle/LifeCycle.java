package Topic2_ThreadLifeCycle;
public class LifeCycle extends Thread {

    @Override
    public void run(){
        System.out.println("RUNNING"); // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) throws InterruptedException {

        LifeCycle t1 = new LifeCycle();
        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(100);           // TIME_WAITING
        System.out.println(t1.getState());

        t1.join();                          // TERMINATED
        System.out.println(t1.getState());

    }
}
/*
🔹 1. New (Born State)
   Thread is created but not started.
   Thread t = new Thread();
   It is in NEW state.

🔹 2. Runnables (Ready + Running)
   When you call:
   t.start();
   Thread moves to RUNNABLE state.
   It is ready to run and waiting for CPU.
   JVM scheduler decides when it actually runs.

🔹 3. Running
   Thread is actively executing run() method.
   This is part of Runnables state (Java combines Ready + Running).

🔹 4. Blocked / Waiting / Timed Waiting
  ➤ Blocked:
     Waiting to acquire a lock (synchronization issue)
  ➤ Waiting:
     Waiting indefinitely for another thread
     t.wait();
     t.join();
  ➤ Timed Waiting:
     Waiting for a specific time
     Thread.sleep(1000);
     t.join(1000);

🔹 5. Terminated (Dead)
    Thread completes execution of run()
    Cannot restart again
 */
