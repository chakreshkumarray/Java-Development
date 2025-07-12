package List.CopyOnWriteArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FirstProgramE {
    public static void main(String[] args) {

      //  List<String> shoppingList = new ArrayList<>(); // Problem
        List<String> shoppingList = new CopyOnWriteArrayList<>(); // Solution
        shoppingList.add("Milk");
        shoppingList.add("Eggs");
        shoppingList.add("Bread");
        System.out.println("Initial Shopping list : "+shoppingList);

        for (String item: shoppingList){
            System.out.println(item);

            // Try to modify the list while reading
            if (item.equals("Eggs")){
                shoppingList.add("Butter");
                System.out.println("Added butter while reading..");
            }
        }
        System.out.println("Updated Shopping List : "+shoppingList);

    }
}
