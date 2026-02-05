package Set.LinkedHashSet;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AdvancedLinkedHashSet {
    public static void main(String[] args) {

        // Scenario: A raw list of clicks from the server (contains duplicates)
        List<Product> rawClicks = new ArrayList<>();
        rawClicks.add(new Product(101, "Sony Headphones"));
        rawClicks.add(new Product(102, "Apple Watch"));
        rawClicks.add(new Product(101, "Sony Headphones")); // Duplicate ID
        rawClicks.add(new Product(103, "Logitech Mouse"));

        System.out.println("Raw List (Size " + rawClicks.size() + "): " + rawClicks);

        // 2. THE ONE-LINER TRICK
        // Convert List -> LinkedHashSet to remove duplicates while KEEPING order
        Set<Product> uniqueHistory = new LinkedHashSet<>(rawClicks);

        System.out.println("Cleaned History (Size " + uniqueHistory.size() + "): " + uniqueHistory);

        // 3. Re-converting to List (if your API requires a List)
        List<Product> finalDisplayList = new ArrayList<>(uniqueHistory);
        System.out.println(finalDisplayList);
    }
}
