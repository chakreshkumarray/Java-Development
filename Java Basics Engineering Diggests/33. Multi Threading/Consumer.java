package ThreadCommunication_10;

public class Consumer implements Runnable{

    private final SharedResource resource;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }
    @Override
    public void run(){
        for (int i =0; i<10; i++){
            int value = resource.consume();
            //   System.out.println( " consumed " + value);
        }
    }


}
