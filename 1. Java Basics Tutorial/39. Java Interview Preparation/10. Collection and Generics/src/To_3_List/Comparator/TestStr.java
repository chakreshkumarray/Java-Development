package To_3_List.Comparator;
import java.util.List;
import java.util.Arrays;

public class TestStr {
    public static void main(String[] args) {

        List<String> words =  Arrays.asList("ck","ak","hk","ck","ak","pk");

        // By Interface Comparator
        words.sort( new StringComparator());
        System.out.println(words);

        // By Lambda Expression
        words.sort( (a,b)->b.length()-a.length() );
        System.out.println(words);

    }
}
