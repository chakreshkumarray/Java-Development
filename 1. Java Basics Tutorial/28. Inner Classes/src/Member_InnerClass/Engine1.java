package Member_InnerClass;

public class Engine1 {
    private Car car;

    public Engine1(Car car){
        this.car = car;
    }

    void start(){
        if(!car.isEngineOn()){
            car.setEngineOn(true);
            System.out.println(car.getModel() + " Engine1 started..");
        }else {
            System.out.println(car.getModel() + " Engine1 is already On..");
        }
    }

    void stop(){
        if (car.isEngineOn()){
            car.setEngineOn(false);
            System.out.println(car.getModel() + " Engine1 Stopped..");
        }else {
            System.out.println(car.getModel() + " Engine1  is already Off.");
        }
    }

}
