package Member_IneerClass;

public class Car {
    private  String model;

    private boolean isEngineOn;

    public Car(String model){
        this.model = model;
        this.isEngineOn = false;
    }

    public String getModel(){
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        isEngineOn = engineOn;
    }

    // Inner Classes
    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "Engine started..");
            }else {
                System.out.println(model + "Engine is already On..");
            }
        }
        void stop(){
            if (isEngineOn){
                isEngineOn = false;
                System.out.println(model + "Engine Stopped..");
            }else {
                System.out.println(model + "Engine  is already Off.");
            }
        }


    }

}
