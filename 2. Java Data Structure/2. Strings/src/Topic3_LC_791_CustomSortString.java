import java.util.HashSet;
import java.util.Set;

public class Topic3_LC_791_CustomSortString {
    public static void main(String[] args) {

        System.out.println(CustomSortString("cba","abcd"));

    }

    public static String CustomSortString(String order, String s){

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[] ca = new int[26];

        for(char i: order.toCharArray()){
            set.add(i);
        }

        for(char i: s.toCharArray()){
            if(!set.contains(i)){
                sb.append(i);
            }else{
                ca[i-'a']++;
            }
        }

        for(char c: order.toCharArray()){
            int i = ca[c-'a'];
            while(i-->0){
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
