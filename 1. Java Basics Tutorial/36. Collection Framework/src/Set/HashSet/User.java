package Set.HashSet;
import java.util.Objects;

public class User {
    private final int id;
    private final String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // CRITICAL: Override equals so HashSet knows when two Users are "the same"
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return id == user.id; // We define uniqueness by ID
    }

    // CRITICAL: Override hashCode to place equal objects in the same bucket
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name;
    }
}
