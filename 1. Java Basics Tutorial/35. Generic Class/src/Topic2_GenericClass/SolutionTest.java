package Topic2_GenericClass;

public class SolutionTest {
    public static void main(String[] args) {

        Solution<Integer> counter = new Solution<Integer>();        // Box is now type-safe
        counter.setValue(205423);                                   // No issue, it's an Integer
        Integer i = counter.getValue();                            // No casting needed
        System.out.println(i);
    }
}
