package Topic4_ThreadMethod;

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
/*
🔹 What is sleep()?
Ans. sleep() is used to pause (delay) the current thread for a specific time.

🔹 Simple Meaning
➡️ “Stop execution for some time, then continue.”
 */