package List.ArraysArrayList;
import java.lang.reflect.Field;
import java.util.ArrayList;

public class Reflection_Capacity {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(12);
        list.add(36);
        list.add(85);
        list.add(74);
        list.add(36);
        list.add(96);
        list.add(32);
        list.add(55);
        list.add(14);
        list.add(29);
        list.add(12);
        System.out.println(list.size());

        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        Object[] elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity :" +elementData.length);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity "+elementData.length);

        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);
        list.remove(2);

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity "+elementData.length);

        list.trimToSize();

        elementData = (Object[]) field.get(list);
        System.out.println("ArrayList Capacity "+elementData.length);

    }
}
