package List.ArraysArrayList;
import java.util.ArrayList;

public class FirstProgram {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(123);   // index 0
        list.add(125);   // index 1
        list.add(20542); // index 2

        System.out.println(list.get(0));
        System.out.println(list.get(1));

        // By Loop
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
