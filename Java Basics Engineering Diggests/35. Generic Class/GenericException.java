package Topic10_GenericException.Intro;

public class GenericException <T extends Exception > {

    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
