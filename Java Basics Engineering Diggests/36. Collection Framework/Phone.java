package Map.HashMap.Garabge_Collection;

public class Phone {

    String brand;
    String model;

    public Phone(String brand , String model){
        this.brand = brand;
        this.model = model;
    }

    public String getBrand(){
        return brand;
    }
    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

}
