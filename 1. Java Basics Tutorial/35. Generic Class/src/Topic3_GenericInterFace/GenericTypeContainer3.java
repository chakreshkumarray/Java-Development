package Topic3_GenericInterFace;

public class GenericTypeContainer3<T> implements GenericContainer3 {

    private T item;


    @Override
    public void add(Object item) {

    }

    @Override
    public Object get() {
        return item;
    }
}
