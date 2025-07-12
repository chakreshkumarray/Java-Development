package Map.HashMap.LinkedHashMap;
import java.util.LinkedHashMap;

public class InitialCapacity {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>(15,0.5f,false);

        linkedHashMap.put("Apple",21);
        linkedHashMap.put("Banana",15);
        linkedHashMap.put("Papaya",17);
        linkedHashMap.put("Orange",13);

        linkedHashMap.get("Banana");

        System.out.println(linkedHashMap);
    }
}
