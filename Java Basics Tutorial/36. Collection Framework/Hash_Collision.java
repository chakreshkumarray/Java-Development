package Map.HashMap.HashMap;

public class Hash_Collision {
    public static void main(String[] args) {

        System.out.println(Hash("ABC"));
        System.out.println(Hash("CBA"));

    }

     // Collision happened

    public  static int Hash(String key){
        int sum = 0;
        for (char c: key.toCharArray()){
            sum = sum + (int) c;
        }
        return sum % 10;
    }

}


