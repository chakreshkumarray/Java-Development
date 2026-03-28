import java.util.HashMap;
import java.util.Map;

public class A35_DuplicateElementOccurrence {
    public static void main(String[] args) {
        /*
        input: 41, 46, 61, 46, 14, 62, 66, 14, 46
        output: 66:1, 14:2, 61:1, 46:3, 41:1, 62:1
         */

        int[] arr = {41, 46, 61, 46, 14, 62, 66, 14, 46};
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++){
            int Element = arr[i];

            int Count = map.getOrDefault(Element,0);
            map.put(Element,Count + 1);
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+ ":"+ entry.getValue());
        }

    }
}
