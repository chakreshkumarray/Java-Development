package SingleInheritance;

public class Vehicle {

    protected int numberOfTires;

    public void setNumberOfTires(int numberOfTires) {
        this.numberOfTires = numberOfTires;
    }


    public void commute(){
        System.out.println("I am going place a two place be using tires: "+numberOfTires);
    }

}
