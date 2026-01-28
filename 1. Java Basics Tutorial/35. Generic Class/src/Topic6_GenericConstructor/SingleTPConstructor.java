package Topic6_GenericConstructor;

public class SingleTPConstructor<T extends Number>{
    private T value;

    public SingleTPConstructor(T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        SingleTPConstructor<Integer> box1 = new SingleTPConstructor<>(4);
        System.out.println(box1);

    }
}
