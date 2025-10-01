package Topic9_DeadLock;

public class Paper {
    public synchronized void writingWithPaperAndPen(Topic9_DeadLock.Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using paper"+this+" and trying");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using paper"+this);
    }

 }
