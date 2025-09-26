public class Car {

    int noOfWheels;
    String color;
    float maxSpeed;
    int noOfSeats;
    int currentFuelInLiters;


    // Creating Constructor direct on instance Class
    Car(){
        noOfWheels = 4;
        color = "Pink";
        maxSpeed = 50;
        noOfSeats = 8;
        currentFuelInLiters = 10;
    }

    // current instance method
    public  Car start(){
        if (currentFuelInLiters > 0){
            System.out.println("car is stared");
        }else {
            System.out.println("Car is not started");
        }
        return this;
    }
    public void drive(){
        if (currentFuelInLiters ==0){
            System.out.println("Car is out of fuel");
        }else if (currentFuelInLiters < 5){
            System.out.println("Car is in Reserved mode,please refuel");
            currentFuelInLiters--;
        }else {
            System.out.println("Car is driving");
            currentFuelInLiters--;
        }
    }

    public void addFuel(float currentFuelInLiters){
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel(){
        return currentFuelInLiters;
    }
}