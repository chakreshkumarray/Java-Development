package Set.LinkedHashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BasicLinkedHashSet {
    public static void main(String[] args) {

        // 1. Create the Set
        Set<String> recentItems = new LinkedHashSet<>();

        // 2. Simulate User browsing
        System.out.println("User views: iPhone 15");
        recentItems.add("iPhone 15");

        System.out.println("User views: Galaxy S24");
        recentItems.add("Galaxy S24");

        System.out.println("User views: iPhone 15 (Duplicate)");
        recentItems.add("iPhone 15"); // Duplicate ignored, position unchanged

        System.out.println("User views: MacBook Pro");
        recentItems.add("MacBook Pro");

        // 3. Display Result
        System.out.println("\n--- Final Display List ---");
        for (String item : recentItems) {
            System.out.println(item);
        }
    }
}
