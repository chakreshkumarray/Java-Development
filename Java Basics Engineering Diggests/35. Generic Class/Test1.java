package Topic2_GenericClass.Problem;

public class Test1 {
    public static void main(String[] args) {

        Box box = new Box();

        box.setValue(1);
        int i = (Integer)box.getValue();
        System.out.println(i);

        box.setValue("hello");
        String str = (String)box.getValue();
        System.out.println(str);

        // Problem
        box.setValue(12);        // Exception
        String i1 = (String)box.getValue();
        System.out.println(i1);
    }
}
