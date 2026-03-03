import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class A18_DuplicateElement_HashTable {
    public static void main(String[] args) {

        // Hash Table -> Store Element in form of key and value
        // get and match
        // put
        // Set --> store unique element

        int[] arr = {3, 5, 4, 3, 2, 2, 1, 3};
        Map<Integer,Integer> hash = new HashMap<>();

        for (int i : arr){
            Integer count = hash.get(i);
            if (count == null){
                hash.put(i, 1);
            }else {
                count = count + 1;
                hash.put(i, count);
            }
        }
        Set<Map.Entry<Integer,Integer>> set = hash.entrySet();
        for (Map.Entry<Integer,Integer> map : set){
            if (map.getValue() > 1){
                System.out.println(map.getKey()+ " ");
            }
        }

    }
}
