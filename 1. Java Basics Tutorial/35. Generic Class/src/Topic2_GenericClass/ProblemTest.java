package Topic2_GenericClass;
import javax.swing.*;

public class ProblemTest {
    public static void main(String[] args) {

        Problem box = new Problem();
        box.setValue("Hello");
        System.out.println(box.getValue());

    }
}
