import java.util.HashSet;
import java.util.Set;

public class Topic16_LC_1496_PathCrossing {
    public static void main(String[] args) {

        System.out.println(isPathCrossing("NES"));
        System.out.println(isPathCrossing("NESWW"));
    }

    public static boolean isPathCrossing(String path) {
        Set<String> set = new HashSet<>();
        int x = 0;
        int y = 0;
        set.add(0 + "," + 0);

        for (char c: path.toCharArray()){
            if (c == 'N'){
                y++;
            }else if (c == 'W'){
                x--;
            } else if (c == 'S') {
                y--;
            } else if (c == 'E') {
                x++;
            }
            String coo = x + "," + y;
            if (set.contains(coo)){
                return true;
            }
            set.add(coo);
        }
        return false;
    }

}
