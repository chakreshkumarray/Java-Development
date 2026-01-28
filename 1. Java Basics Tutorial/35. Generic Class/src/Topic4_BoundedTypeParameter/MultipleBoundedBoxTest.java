package Topic4_BoundedTypeParameter;

public class MultipleBoundedBoxTest {
    public static void main(String[] args) {

        MultipleBoundedMyNumber myNumber = new MultipleBoundedMyNumber(12);

        MultipleBoundedBox<MultipleBoundedMyNumber> box = new MultipleBoundedBox<>(myNumber);
        box.display();

    }
}
