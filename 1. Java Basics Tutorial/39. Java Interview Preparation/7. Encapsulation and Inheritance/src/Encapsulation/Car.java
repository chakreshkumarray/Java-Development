package Encapsulation;

public class Car {

    private String color;
    private String model;
    private int wheel;
    private double fuelLevel;
    private double price;

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return color;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return model;
    }

    public void setWheel(int wheel){
        this.wheel = wheel;
    }

    public int getWheel(){
        return wheel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
