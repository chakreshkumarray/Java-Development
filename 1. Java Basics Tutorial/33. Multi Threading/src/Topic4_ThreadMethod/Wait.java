package Topic4_ThreadMethod;

public class Wait {
    public static void main(String[] args) {

        Object obj = new Object();

        synchronized (obj) {
            try {
                System.out.println("Thread is waiting...");
                obj.wait();  // releases lock & waits
                System.out.println("Thread resumed");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
/*
🔹 What is wait()?

wait() is a method used for inter-thread communication.

👉 It makes the current thread:

release the lock
go into waiting state

🔹 Where is it defined?
Inside Object class
 */