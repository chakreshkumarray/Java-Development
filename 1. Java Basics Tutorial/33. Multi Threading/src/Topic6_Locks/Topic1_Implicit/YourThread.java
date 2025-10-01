package Topic6_Locks.Topic1_Implicit;

class YourThread extends Thread {

    public Number number;

    public YourThread(Number number){
        this.number = number;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            number.increment();
        }

    }
}
