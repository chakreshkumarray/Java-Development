package Topic6_GenericConstructor.SingleTPConstructor;

public class Box1 <T extends Number>{
    private T value;

    public Box1 (T value){
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Box1<Integer> box1 = new Box1<>(4);


    }
}
