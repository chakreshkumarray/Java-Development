package Thread_LifeCycle_2;
class LifeCycle extends Thread {

    @Override
    public void run(){
        System.out.println("RUNNING"); // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
    public static void main(String[] args) throws InterruptedException {

        LifeCycle t1 = new LifeCycle();
        System.out.println(t1.getState()); // NEW

        t1.start();
        System.out.println(t1.getState()); // RUNNABLE

        Thread.sleep(100);           // TIME_WAITING
        System.out.println(t1.getState());

        t1.join();                          // TERMINATED
        System.out.println(t1.getState());

    }

}
