package Topic4_BoundedTypeParameter;

public class WithExtendsBoxes<T extends Number>{

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
