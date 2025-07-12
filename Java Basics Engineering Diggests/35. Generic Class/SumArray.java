package Topic8_GenericWildCards.UpperBound;
import java.util.Arrays;
import java.util.List;

public class SumArray {
    public static void main(String[] args) {

        System.out.println(sum(Arrays.asList(1.2,54,67,25)));

    }

    // Upper Bound
    public static double sum(List < ? extends Number > numbers){

        double sum = 0;
        for (Number o : numbers){
            sum = sum + o.doubleValue();
        }
        return  sum;
    }

    // Lower Bound
    public static void printNum(List<? super Integer> list){
        for (Object abc : list){
            System.out.println(abc);
        }
    }

}
