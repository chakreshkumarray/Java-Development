package Topic4_BoundedTypeParameter.WithExtends;

public class Boxes<T extends Number>{

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
