package Topic4_ThreadMethod;

class Run extends Thread {

    @Override
    public void run() {
        System.out.println("This is Running..");
    }

    public static void main(String[] args) {

        Run t1 = new Run();
        t1.start();
    }


}
/*
🔹 What is run()?
Ans. run() is the method that contains the code a thread will execute.

🔹 Simple Meaning
Ans. run() = task that the thread performs
 */