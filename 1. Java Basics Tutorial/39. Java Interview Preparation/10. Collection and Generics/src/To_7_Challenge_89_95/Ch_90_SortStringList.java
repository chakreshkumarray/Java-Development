package To_7_Challenge_89_95;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ch_90_SortStringList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Bear","Zebra","Lion","Ant");
        sortString(list);
        System.out.println(list);
    }

    public static void sortString(List<String> stringList){
        Collections.sort(stringList);
        Collections.reverse(stringList);
    }
}
