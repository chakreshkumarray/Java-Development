package Topic4_ThreadMethod;

class SetPriority extends Thread{

    public SetPriority(String name){
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 5; i++){
            String a = " ";
            for (int j = 0; j < 10000; j++){
                a += "a";
            }
            System.out.println(Thread.currentThread().getName() + " - Priority "+
                    Thread.currentThread().getPriority() + " count " + i);
          try {
          Thread.sleep(10);
          }catch (InterruptedException e) {
              Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {

        SetPriority l = new SetPriority("Low Priority Thread");
        SetPriority m = new SetPriority("Medium Priority Thread");
        SetPriority n = new SetPriority("High Priority Thread");

        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);

        l.start();
        m.start();
        n.start();

    }
}
/*
🔹 What is setPriority()?
Ans. setPriority() is used to set the priority of a thread.
 Priority tells the CPU:
 “Which thread should get more chance to run?”

🔹 Simple Meaning
➡️ Higher priority = more chance to execute
➡️ Lower priority = less chance

⚠️ Important: It’s not guaranteed, just a suggestion to the scheduler.
 */
