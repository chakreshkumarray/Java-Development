package Topic4_BoundedTypeParameter;

public class WithExtendsTests {
    public static void main(String[] args) {

        WithExtendsBoxes<Integer> box = new WithExtendsBoxes<>();
        box.setValue(123);
        Integer i = box.getValue();
        System.out.println(i);
    }
}
