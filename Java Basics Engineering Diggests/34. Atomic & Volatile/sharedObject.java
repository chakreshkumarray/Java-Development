package VOLATILE;

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
