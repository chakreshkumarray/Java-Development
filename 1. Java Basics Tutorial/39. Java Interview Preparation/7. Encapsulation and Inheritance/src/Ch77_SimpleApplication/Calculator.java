package Ch77_SimpleApplication;

public class Calculator {
    public static void main(String[] args) {

        Circle circle = new Circle(5.5);

        Rectangle rectangle = new Rectangle(5,10);

        double cir = Math.PI * Math.pow(circle.radius,2);
        double rec = rectangle.breadth * rectangle.length;

        System.out.println(cir);
        System.out.println(rec);
    }

}
