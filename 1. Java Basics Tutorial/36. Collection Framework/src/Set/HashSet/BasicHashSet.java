package Set.HashSet;
import java.util.HashSet;

public class BasicHashSet {
    public static void main(String[] args) {

        // 1. Create
        HashSet<String> skills = new HashSet<>();

        // 2. Add (Basic)
        skills.add("Java");
        skills.add("Python");
        skills.add("SQL");

        // 3. Add Duplicate (Ignored)
        boolean added = skills.add("Java"); // Returns false
        System.out.println("Was duplicate 'Java' added? " + added);

        // 4. Remove
        skills.remove("SQL");

        // 5. Check existence
        if (skills.contains("Python")) {
            System.out.println("Python skill found!");
        }

        // 6. Iterate (Order is random!)
        System.out.println("Skills: " + skills);
    }
}
