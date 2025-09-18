import java.util.*;

public class Topic15_LC_1436_DestinationCity {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list.add("London");
        list1.add("New York");
        
    }

    public static String desCity(List<List<String>> paths){
        Set<String> set = new HashSet<>();

        for (List<String> path:paths){
            set.add(path.get(0));
        }

        for (List<String> path:paths){
            if (!set.contains(path.get(1))){
                return path.get(1);
            }
        }

        return null;
    }
}
