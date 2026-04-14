package Topic4_ThreadMethod;

public class Start extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++){
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {

        Start t1 = new Start();
        t1.start(); // create a new thread
    }
}
/*
🔹 What is start()?
Ans. start() is used to create a new thread and begin its execution.

🔹 Simple Meaning
“Start a new thread and run the task in parallel.”
 */