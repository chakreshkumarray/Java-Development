package Topic9_DeadLock;

public class DeadLock {
        public static void main(String[] args) {
            Pen pen = new Pen();
            Paper paper = new Paper();

            Thread t1 = new Thread(new Task1(pen,paper),"Thread 1");
            Thread t2 = new Thread(new Task2(pen,paper),"Thread 2");

            t1.start();
            t2.start();
        }
    }


