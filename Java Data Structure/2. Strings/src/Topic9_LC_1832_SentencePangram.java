import java.util.HashSet;
import java.util.Set;

public class Topic9_LC_1832_SentencePangram {
    public static void main(String[] args) {

        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }

    public static boolean checkIfPangram(String s){
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++){
            set.add(s.charAt(i));
        }
        return set.size() == 26;
    }

}
