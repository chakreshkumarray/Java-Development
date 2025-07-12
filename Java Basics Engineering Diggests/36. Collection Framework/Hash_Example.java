package Map.HashMap.HashMap;
import java.util.HashMap;

public class Hash_Example {
    public static void main(String[] args) {
        HashMap<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("Apple",50);
        fruitMap.put("Banana",30);
        fruitMap.put("Orange",80);
        fruitMap.put("Grape",20);

        System.out.println(fruitMap);

    }
}
