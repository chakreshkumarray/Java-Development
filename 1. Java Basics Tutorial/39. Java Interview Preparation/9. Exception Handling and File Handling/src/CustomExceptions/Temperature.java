package CustomExceptions;

public class Temperature extends Exception{
    private double degrees;

    public Temperature(double degrees){
        this.degrees = degrees;
    }

    public String getMessage(){
        return "The Temperature ("+degrees+ " C ) is not in normal range ";
    }

    public double getDegrees(){
        return degrees;
    }

}
