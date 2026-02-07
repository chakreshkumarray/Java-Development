package Map.LRUCache;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

    private final int capacity;

    public LRUCache(int capacity){
        super(capacity, 0.5f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K,V> eldest){
        return size() > capacity;
    }

    public static void main(String[] args) {

        LRUCache<String,Integer> studentMap = new LRUCache<>(3);
        studentMap.put("ck",80);
        studentMap.put("Bob",75);
        studentMap.put("ak",71);
        studentMap.put("dk",89);
        studentMap.put("Bob",100);

        studentMap.get("Bob");

        System.out.println(studentMap);

    }
}
