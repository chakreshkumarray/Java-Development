package DeadLock_9;

public class Task2 implements Runnable{

    private final Pen pen;
    private final Paper paper;

    public Task2(Pen pen, Paper paper) {
        this.pen = pen;
        this.paper = paper;
    }

    @Override
    public void run() {
        synchronized (pen){                        //solution
            paper.writingWithPaperAndPen(pen);
        }
       //  paper.writingWithPaperAndPen(pen);          //problem
    }


}
