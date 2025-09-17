import java.util.HashSet;
import java.util.Set;

public class Topic11_LC_771_JewelsStones {
    public static void main(String[] args) {

        System.out.println(numJewelsInStones("aA","aAAbbbb"));
        System.out.println(numJewelsInStones("z","ZZ"));
    }

    public static int numJewelsInStones(String jewels, String stones){
        int res = 0;
        Set<Character> set  = new HashSet<>();

        for (char i : jewels.toCharArray()){
            set.add(i);
        }

        for (char i : stones.toCharArray()){
            if (set.contains(i)){
                res++;
            }
        }
        return res;
    }


}
