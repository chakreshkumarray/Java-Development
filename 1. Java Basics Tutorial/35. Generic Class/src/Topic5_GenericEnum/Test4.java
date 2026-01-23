package Topic5_GenericEnum;

public class Test4 {
    public static void main(String[] args) {
        Week day1 = Week.Sunday;
        Week day2 = Week.Monday;
        System.out.println(day1);
        System.out.println(day2);
        System.out.println(Week.Tuesday);

        // ProblemTest                     type safe
        // Week day = "Monday";        Compile-time error

    }
}
