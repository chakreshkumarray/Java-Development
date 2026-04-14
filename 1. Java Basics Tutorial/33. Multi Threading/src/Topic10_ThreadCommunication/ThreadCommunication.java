package Topic10_ThreadCommunication;

public class ThreadCommunication {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

        Thread pt = new Thread(new Producer(resource));
        Thread ct = new Thread(new Consumer(resource));

        pt.start();
        ct.start();
    }
}
/*
🔹 What is Thread Communication?
  Thread communication is a mechanism where threads coordinate with each other to avoid problems like:
   unnecessary waiting
   race conditions
   data inconsistency

🔹 Why is it Needed?
    Imagine:
    One thread is producing data
    Another thread is consuming data
    Without communication:
    Consumer may try to read before data is ready ❌

   With communication:
   Consumer waits until producer signals ✅
 */