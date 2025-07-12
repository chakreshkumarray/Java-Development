package List.Arrays.Comparator;
import java.util.Comparator;

public class IntegersComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2- o1;
    }

}

