package Topic9_TypeErasure;

public class NumberBoxTest {
    public static void main(String[] args) {

        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setNumber(10);
        Integer value = intBox.getNumber();

        System.out.println(value);

    }
}
