package Topic1_WhyGeneric.WithGenerices;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<String>();
        list.add("Ck");
        list.add("Ak");
        list.add("AK");

        String s = list.get(0);
        String s1 = list.get(1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(list.get(2));
    }
}
