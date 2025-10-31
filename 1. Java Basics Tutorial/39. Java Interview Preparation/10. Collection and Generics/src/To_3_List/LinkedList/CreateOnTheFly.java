package To_3_List.LinkedList;
import java.util.Arrays;
import java.util.LinkedList;

public class CreateOnTheFly {
    public static void main(String[] args) {

        LinkedList<String> animal = new LinkedList<>(Arrays.asList("Cow","Dog","Elephant","Tiger","Lion"));

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("Buffalo","Cow","Dog","Elephant","Tiger","Lion"));

        System.out.println(animal);

        // Remove All
        animals.removeAll(animal);
        System.out.println(animals);
    }
}
