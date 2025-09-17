import java.util.HashSet;
import java.util.Set;

public class Topic8_LC_2351_FirstLetterToAppearTwice {
    public static void main(String[] args) {

        System.out.println(repeatedCharacter("abccbaacz"));
    }

    public static char repeatedCharacter(String s){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            if (set.contains(s.charAt(i))){
                return s.charAt(i);
            }else {
                set.add(s.charAt(i));
            }
        }
        return 'a';
    }

}
