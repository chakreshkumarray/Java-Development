package Thread_Methods_4;
class Join extends Thread{

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
