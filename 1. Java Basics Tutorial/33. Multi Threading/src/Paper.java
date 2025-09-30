package DeadLock_9;

public class Paper {
    public synchronized void writingWithPaperAndPen(Pen pen){
        System.out.println(Thread.currentThread().getName()+" is using paper"+this+" and trying");
        pen.finishWriting();
    }
    public synchronized void finishWriting(){
        System.out.println(Thread.currentThread().getName()+" finished using paper"+this);
    }

 }
