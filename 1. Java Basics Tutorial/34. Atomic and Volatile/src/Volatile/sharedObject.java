package Volatile;
public class sharedObject{
    private volatile boolean flag = false;

    public void setFlag(){
        System.out.println(" Writer Thread make the Set flag true..!");
        flag = true;
    }

    public void printFlag(){
        while (!flag){
            // do nothing
        }
        System.out.println(" Reader thread  Print Flag is true !");
    }

    public static void main(String[] args) throws InterruptedException {

        sharedObject share = new sharedObject();
        Thread writerThread = new Thread(() ->{
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            share.setFlag();
        });
        Thread readerThread = new Thread(share::printFlag); // also lambda

        writerThread.start();
        readerThread.start();
    }
}
/*
🔹 1. volatile
 What is volatile?
volatile is a keyword used for variables to ensure: visibility across threads

🔹 What it Guarantees
✔ Latest value is always read from main memory
 */