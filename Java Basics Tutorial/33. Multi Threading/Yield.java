package Thread_Methods_4;

class Yield extends Thread{

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            System.out.println(Thread.currentThread().getName() + " Running");
            Thread.yield();
        }

    }

    public static void main(String[] args) {
        Yield t1 = new Yield();
        Yield t2 = new Yield();
        t1.start();
        t2.start();

    }
}
