package Topic4_BoundedTypeParameter.MultipleBounded;

public class Box<T extends Number & printable> {
    private final T item;

    public Box(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}
