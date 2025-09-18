package Supplier;
import java.util.function.Supplier;

public class Demo {
    public static void main(String[] args) {
        Supplier<String> give = () -> "Hello Ck";
        System.out.println(give.get());
    }
}
