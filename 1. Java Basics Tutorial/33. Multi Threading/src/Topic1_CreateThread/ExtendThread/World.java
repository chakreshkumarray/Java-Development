package Topic1_CreateThread.ExtendThread;

public class World extends Thread{

    @Override
    public void run() {
        for (; ;) {
            System.out.println("World");
          //  System.out.println(Thread.currentThread().getName());
        }
    }

}
/*
🔹 What is Multithreading?
Ans. Multithreading is a concept where a single process runs multiple threads (lightweight tasks) concurrently.
     A thread = smallest unit of execution inside a program.
     Process =

     Example: A browser
         One thread → load UI
         One thread → download images
         One thread → run JavaScript
             All run simultaneously (or appear to).
    Example:In apps like Microsoft Word
             you can type while autosave runs in background

🔹 Why Do We Need Multithreading?
Ans. Better Performance
     Multiple tasks run in parallel
     Uses multicore CPUs efficiently
     Example: Without threads → tasks run one by one
              With threads → tasks run together

🔹 What is a Process?
Ans. A process is a running program.
    Example:
     When you open:
     Google Chrome
     Microsoft Word
           Each one is a separate process.
         Simple meaning: Process = Full application running in memory

🔹 What is a Thread?
Ans. A thread is a small part of a process that does a task.
    Example: Inside Chrome:
     One thread → loads page
     One thread → plays video
     One thread → handles clicks
     Simple meaning: Thread = Worker inside a process

🔹 Easy Real-Life Analogy
   Think of a process like a company.
    Company = Process
    Employees = Threads
Each employee (thread) does different work, but all belong to the same company (process).

🔹 Key Difference (Very Simple)
   Process	Thread
   Big unit	Small unit
    Independent	Part of process
     Own memory	Shares memory
      Slower	Faster

🔹 One-Line Summary (Interview)
👉 Process: A program that is running
👉 Thread: A unit of execution inside a process
 */