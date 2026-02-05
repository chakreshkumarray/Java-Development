package Set.HashSet;
import java.util.HashSet;

public class AdvancedHashSet {
    public static void main(String[] args) {

        HashSet<User> users = new HashSet<>();

        User u1 = new User(101, "Alice");
        User u2 = new User(101, "Alice"); // Technically a new object, but logically same data

        users.add(u1);
        users.add(u2);

        // If we didn't override equals/hashCode, size would be 2!
        System.out.println("Set Size: " + users.size()); // Output: 1
    }
}
