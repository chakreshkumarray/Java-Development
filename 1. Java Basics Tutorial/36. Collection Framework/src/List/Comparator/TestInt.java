package List.Comparator;
import java.util.ArrayList;

public class TestInt {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(52);
        list.add(46);
        list.add(29);
        list.add(18);

        list.sort(new IntegersComparator());
        System.out.println(list);
    }
}
