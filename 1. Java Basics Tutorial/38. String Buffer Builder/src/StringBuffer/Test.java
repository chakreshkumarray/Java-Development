package StringBuffer;
public class Test {
    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();
        Task t1 = new Task(sb);
        Task t2 = new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final length : "+sb.length());
    }
}
