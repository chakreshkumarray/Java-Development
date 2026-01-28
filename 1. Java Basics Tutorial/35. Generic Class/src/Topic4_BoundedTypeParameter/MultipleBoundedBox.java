package Topic4_BoundedTypeParameter;

public class MultipleBoundedBox<T extends Number & MultipleBoundedPrintable> {
    private final T item;

    public MultipleBoundedBox(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}
