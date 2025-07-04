public class Ordinal {
    public static void main(String[] args) {

        OrdinalDay monday = OrdinalDay.Mon;
        int ordinal = monday.ordinal();
        System.out.println(ordinal);

        OrdinalDay newday = OrdinalDay.Wed;
        int odl = newday.ordinal();
        System.out.println(odl);
    }
}
