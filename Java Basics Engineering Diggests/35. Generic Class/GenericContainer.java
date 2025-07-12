package Topic3_GenericInterFace.GenericType;

public class GenericContainer<T> implements Container3<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
