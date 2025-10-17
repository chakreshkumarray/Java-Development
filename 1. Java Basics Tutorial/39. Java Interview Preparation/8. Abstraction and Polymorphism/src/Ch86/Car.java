package Ch86;

public class Car extends Vehicle{

    @Override
    public void service(){
        super.service();
        System.out.println("Car Getting servicing..");
    }

}
