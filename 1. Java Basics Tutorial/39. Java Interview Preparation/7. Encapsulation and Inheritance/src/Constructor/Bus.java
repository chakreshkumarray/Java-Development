package Constructor;

public class Bus {

    private String color;
    private String model;
    private int wheel;
    private double fuelLevel;
    private double price;

    public Bus(String color, String model, int wheel, double fuelLevel, double price) {
        this.color = color;
        this.model = model;
        this.wheel = wheel;
        this.fuelLevel = fuelLevel;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getWheel() {
        return wheel;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public double getPrice() {
        return price;
    }

}
