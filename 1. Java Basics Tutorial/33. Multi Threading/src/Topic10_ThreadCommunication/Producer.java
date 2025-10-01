package Topic10_ThreadCommunication;

public class Producer implements Runnable{

    private final SharedResource resource;

    public Producer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run(){
        for (int i = 0; i<10; i++){
            resource.produce(i);
            // System.out.println(" Produced " +i);
        }
    }

}
