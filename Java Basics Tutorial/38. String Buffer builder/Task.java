package StringBuffer;

public class Task extends Thread{
    private StringBuffer sb;
    public Task(StringBuffer sb){
        this.sb = sb;
    }
    @Override
    public void run() {
        for (int  i = 0; i < 1000; i++){
            sb.append("c");
        }
    }

}
