package AceesModifier;

public class Car {

    public String color;
    public String model;
    private double FuelLevel;
    private double costOfPurchase;

    public Car(){

    }

    public Car(String color, String model, double fuelLevel, double costOfPurchase) {
        this.color = color;
        this.model = model;
        this.FuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", FuelLevel=" + FuelLevel +
                ", costOfPurchase=" + costOfPurchase +
                '}';
    }


}
