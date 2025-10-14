package Ch83;

public class Circle extends Shape{

    @Override
    public double CalculateArea() {
        return Math.PI * Math.pow(radius,2);
    }

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}
