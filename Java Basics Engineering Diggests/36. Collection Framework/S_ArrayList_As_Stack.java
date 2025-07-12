package List.Stack;
import java.util.ArrayList;

public class S_ArrayList_As_Stack {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Add Or Push
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(3);
        System.out.println(list);

        // Get
        list.get(1);
        System.out.println(list.get(1));

        // Remove OR Pop
        list.remove(list.size()-1);
        System.out.println(list.remove(list.size()-1));
        System.out.println(list);

        // Peek
        list.get(list.size()-1);
        System.out.println(list.get(list.size()-1));
        System.out.println(list);

    }
}
