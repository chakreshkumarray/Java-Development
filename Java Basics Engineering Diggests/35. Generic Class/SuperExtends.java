package Topic8_GenericWildCards.LowerBound;
import java.util.Arrays;
import java.util.List;

public class SuperExtends {
    public static void main(String[] args) {

        List<? extends Number> numbers = Arrays.asList(2,1,2,1,5,4);
        // numbers.add(20);   error not able to add
        List<? super Integer> numbers1 = Arrays.asList(1,1,5,1,6,1,6);
        numbers1.add(21215);
        numbers1.add(null);

    }

    // Upper Bound
    public static double SUM(List < ? extends Number > numbers){

        double sum = 0;
        for (Number o : numbers){
            sum = sum + o.doubleValue();
        }
        return  sum;
    }

    // Lower Bound
    public static void printNumbers(List <? super Integer> list){
        for (Object obj : list){
            System.out.println(obj);
        }
    }
}
