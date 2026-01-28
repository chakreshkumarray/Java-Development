package Topic4_BoundedTypeParameter;

public class MultipleBoundedMyNumber extends Number implements MultipleBoundedPrintable {

    private final int value;

    public MultipleBoundedMyNumber(int value){
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("My Number "+ value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
