package Map.HashMap.IdentityHashMap;
import java.util.HashMap;
import java.util.Map;

public class DemoProblem {
    public static void main(String[] args) {

        String key1 = new String("key");
        String key2 = new String("key");

        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));

        Map<String,Integer> map = new HashMap<>();

        map.put(key1,1);
        map.put(key2,2);

        System.out.println(key1.equals(key2));
        System.out.println(map);

    }
}
