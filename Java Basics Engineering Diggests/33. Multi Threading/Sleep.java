package Thread_Methods_4;

class Sleep extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Sleep t1 = new Sleep();
        t1.start();


    }
}
