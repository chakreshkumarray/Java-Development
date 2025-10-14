package Ch83;
public class Test {
    public static void main(String[] args) {

        Circle circle = new Circle(3);
        System.out.println(circle.CalculateArea());

        Square square = new Square(4);
        System.out.println(square.CalculateArea());
    }
}