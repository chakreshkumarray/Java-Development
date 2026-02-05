package Set.EnumSet;

import java.util.EnumSet;

public class DayEnumSet {
    public static void main(String[] args) {
        
        EnumSet<Day> days = EnumSet.of(Day.Monday,Day.Tuesday);
        System.out.println(days);

    }
}
