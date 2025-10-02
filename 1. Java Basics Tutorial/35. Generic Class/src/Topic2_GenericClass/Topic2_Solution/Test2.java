package Topic2_GenericClass.Topic2_Solution;

public class Test2 {
    public static void main(String[] args) {

        Counter<Integer> counter = new Counter<Integer>();        // Box is now type-safe
        counter.setValue(205423);                                   // No issue, it's an Integer
        Integer i = counter.getValue();                            // No casting needed
        System.out.println(i);
    }
}
