package Topic4_BoundedTypeParameter.WithExtends;

public class Tests {
    public static void main(String[] args) {

        Boxes<Integer> box = new Boxes<>();
        box.setValue(123);
        Integer i = box.getValue();
        System.out.println(i);
    }
}
