package Topic5_Predicate;
import java.util.function.BiPredicate;

public class Bi {
    public static void main(String[] args) {
        BiPredicate<Integer,Integer> biPredicate = (x,y) -> (x+y) % 2 == 0;
        System.out.println(biPredicate.test(4,8));

    }
}
