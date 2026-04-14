package Topic4_ThreadMethod;
public class Join extends Thread{

    @Override
    public void run(){
        try {
            sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {

        Join t1 = new Join();
        t1.start();
        try {
           t1.join();
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Hello");
    }

}
/*
🔹 What is join()?
Ans. join() is used to make one thread wait for another thread to finish.
     Wait until this thread completes, then continue.
 */