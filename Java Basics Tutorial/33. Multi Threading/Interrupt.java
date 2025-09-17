package Thread_Methods_4;

class Interrupt  extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Thread is running..");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args) {

        Interrupt t1 = new Interrupt();
        t1.start();
        t1.interrupt();
    }

}

