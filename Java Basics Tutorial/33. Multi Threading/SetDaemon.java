package Thread_Methods_4;

class SetDaemon extends Thread{

    public void run(){
        while (true){
            System.out.println("Hello World.");
        }
    }


    public static void main(String[] args) {
        SetDaemon t1 = new SetDaemon();
        SetDaemon t2 = new SetDaemon();
        t1.start();
        t2.setDaemon(true);
        t2.start();
        System.out.println("Main Done..");

    }
}
