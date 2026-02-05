package Set.TreeSet;
import java.util.TreeSet;
import java.util.Comparator;

public class AdvanceTreeSet {
    public static void main(String[] args) {

        // Custom Comparator: Sort by Price (Low to High)
        TreeSet<Product> inventory = new TreeSet<>(
                Comparator.comparingInt(p -> p.price)
        );

        inventory.add(new Product("Laptop", 1200));
        inventory.add(new Product("Mouse", 25));
        inventory.add(new Product("Keyboard", 75));
        inventory.add(new Product("Monitor", 300));

        System.out.println("All Products: " + inventory);

        // --- Advanced NavigableSet Features ---

        // 1. Find elements relative to a specific price
        Product reference = new Product("Dummy", 100);

        // higher: Returns the least element strictly greater than the given element
        System.out.println("Next item more expensive than $100: " +
                inventory.higher(reference));

        // lower: Returns the greatest element strictly less than the given element
        System.out.println("Cheaper than $100: " +
                inventory.lower(reference));

        // 2. Poll (Retrieve and Remove)
        System.out.println("Removed Cheapest: " + inventory.pollFirst());
        System.out.println("Removed Most Expensive: " + inventory.pollLast());

    }
}
