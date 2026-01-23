package Topic3_GenericInterFace;

public interface GenericContainer3 {

    <T> void add(T item);

    Object get();
}
