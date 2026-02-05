package Set.TreeSet;

import java.util.Set;
import java.util.TreeSet;

public class BasicTreeSet {
    public static void main(String[] args) {

        // 1. Create a TreeSet
        Set<String> vehicles = new TreeSet<>();

        // 2. Add elements (Unordered insertion)
        vehicles.add("Car");
        vehicles.add("Bike");
        vehicles.add("Airplane");
        vehicles.add("Bike"); // Duplicate is ignored

        // 3. Display (Result is Sorted)
        System.out.println("Sorted Vehicles: " + vehicles);
    }
}
