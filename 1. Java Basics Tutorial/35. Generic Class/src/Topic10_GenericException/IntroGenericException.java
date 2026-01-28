package Topic10_GenericException;

public class IntroGenericException<T extends Exception > {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
