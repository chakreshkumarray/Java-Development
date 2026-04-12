package E6_Ordinal;

public class Ordinal {
    public static void main(String[] args) {

        Day monday = Day.Mon;
        int ordinal = monday.ordinal();
        System.out.println(ordinal);

        Day newday = Day.Wed;
        int odl = newday.ordinal();
        System.out.println(odl);
    }
}
