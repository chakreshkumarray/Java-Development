package To_3_List.Vector;
import java.util.Vector;

public class Capacity {
    public static void main(String[] args) {

        Vector <Integer> vector = new Vector<>();

        // Default Capacity -> 10
        System.out.println(vector.capacity());

        // Increase Capacity
        Vector<Integer> vector1 = new Vector<>(5,3);
        System.out.println(vector1.capacity());

        vector1.add(1);
        vector1.add(1);
        vector1.add(1);
        vector1.add(1);
        vector1.add(1);


        // Initial Capacity
        System.out.println(vector1.capacity());
        vector1.add(1);
        vector1.add(1);

        // Capacity Increment
        System.out.println(vector1.capacity());


    }
}
