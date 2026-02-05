package Set.LinkedHashSet;
import java.util.*;

public class Product {

    // 1. Define the Custom Object

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // CRITICAL: LinkedHashSet uses this to check for duplicates
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id; // Products are equal if IDs match
    }

    // CRITICAL: LinkedHashSet uses this to find the storage bucket
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (ID:" + id + ")";
    }
}
