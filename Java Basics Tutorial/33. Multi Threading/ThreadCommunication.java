package ThreadCommunication_10;

public class ThreadCommunication {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();
        Thread pt = new Thread(new Producer(resource));
        Thread ct = new Thread(new Consumer(resource));

        pt.start();
        ct.start();
    }
}
