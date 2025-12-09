package To_7_Challenge_89_95;

import java.util.Arrays;
import java.util.List;

public class Ch_92_SwapTwoNumber {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(list);
        Swap(list,2, 7);
        System.out.println(list);
    }

    public static void Swap(List<Integer> list, int x, int y){
        try {
            int swap = list.get(x);
            list.set(x, list.get(y));
            list.set(y, swap);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
