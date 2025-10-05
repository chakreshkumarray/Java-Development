package Map.HashMap.HashMap;

import java.util.HashMap;

public class HashCode_Student {
    public static void main(String[] args) {

        HashMap<Hash_Student,String> map = new HashMap<>();
        Hash_Student p1 = new Hash_Student("Alice ", 5);
        Hash_Student p2 = new Hash_Student("Bob", 4);
        Hash_Student p3 = new Hash_Student("Alice", 5);

        map.put(p1,"Engineer"); // hashcode 1 --> index 1
        map.put(p2,"Designer"); // hashcode 2 --> index 2
        map.put(p3,"Manager"); // hashcode 1 --> index 1 --> equals --> replace
        System.out.println(map.size());
        System.out.println(map.get(p1));
        System.out.println(map.get(p3));

        HashMap<String,Integer> map1 = new HashMap<>();
        map1.put("Shubham" ,90);
        map1.put("Neha",92);
        map1.put("Subham",99);
    }

}
