package LOCKS_6.Intrinstic_1;

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
