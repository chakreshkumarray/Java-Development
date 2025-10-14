package Ch83;

public class Square extends Shape{

    @Override
    public double CalculateArea() {
        return side * side;
    }

    private final double side;

    public Square(double side){
        this.side = side;
    }

    public double getSide(){
        return side;
    }

}
