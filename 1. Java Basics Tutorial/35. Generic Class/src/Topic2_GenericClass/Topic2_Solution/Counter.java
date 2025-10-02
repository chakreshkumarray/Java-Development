package Topic2_GenericClass.Topic2_Solution;

public class Counter<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
