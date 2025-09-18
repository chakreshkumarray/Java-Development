import java.util.HashMap;
import java.util.Map;

public class Topic14_LC_3_LongestSubStringWithoutRepeatingCharacter {
    public static void main(String[] args) {

        System.out.println(LengthOfLongestSubString("abcabcbb"));
        System.out.println(LengthOfLongestSubString("bbbbbb"));
    }

    public static int LengthOfLongestSubString(String s){

        int res = 0;
        int left = 0;
        int right = 0;
        Map<Character,Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();

        for (; right < arr.length; right++){
            int idx = map.getOrDefault(arr[right],-1);
            if (idx != -1 && idx >= left){
                res = Math.max(res, right - 1 - left + 1);
                left = idx + 1;
            }
            map.put(arr[right] ,right);
        }
        return  Math.max(res, right -1 - left + 1);
    }
}
