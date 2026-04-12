package Topic0_Inheritance;

public class Vehicle {

    /*
    Advantage --> Code readability
              --> cost-cutting
              --> reduce redundancy
     */

    private String brand;
    private String model;
    private int year;
    private double price;
    private String fuelType;
    private int speed;

    void start() {
        System.out.println("Vehicle started");
    }

    void stop() {
        System.out.println("Vehicle stopped");
    }

    void accelerate() {
        speed += 10;
        System.out.println("Speed increased to " + speed);
    }

    void brake() {
        speed -= 10;
        System.out.println("Speed decreased to " + speed);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

}
