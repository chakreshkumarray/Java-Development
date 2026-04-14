package Topic4_ThreadMethod;

class SetDaemon extends Thread{

    public void run(){
        while (true){
            System.out.println("Hello World.");
        }
    }


    public static void main(String[] args) {

        SetDaemon t1 = new SetDaemon();
        SetDaemon t2 = new SetDaemon();

        t1.start();
        t2.setDaemon(true);
        t2.start();

        System.out.println("Main Done..");

    }
}
/*
🔹 What is setDaemon()?
Ans. setDaemon(true) makes a thread a daemon (background) thread.

🔹 Simple Meaning
Ans. Daemon thread = background worker thread
It works in the background and supports main tasks.
 */