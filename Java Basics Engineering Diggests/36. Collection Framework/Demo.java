package Iterable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    public static void main(String[] args) {
        List<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(13);
        numbers.add(78);
        numbers.add(25);
        numbers.add(31);
        for (Integer i : numbers){
            if (i%2==0){
                numbers.remove(i);
            }
            System.out.println(i);
        }

    }
}
