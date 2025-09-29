package Constructor;
public class Bus {

    private final String color;
    private final String model;
    private final int wheel;
    private final double fuelLevel;
    private final double price;

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
