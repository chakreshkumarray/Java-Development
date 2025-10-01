package Topic4_ThreadMethods;

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
