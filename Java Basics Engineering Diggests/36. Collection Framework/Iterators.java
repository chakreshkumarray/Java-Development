package Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Iterators {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i : list){
            System.out.println(i);
        }
        // internal Working
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
