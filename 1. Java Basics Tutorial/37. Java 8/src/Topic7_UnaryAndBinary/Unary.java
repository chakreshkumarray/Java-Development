package Topic7_UnaryAndBinary;

import java.util.function.UnaryOperator;

public class Unary {
    public static void main(String[] args) {
        UnaryOperator<Integer> unaryOperator = x-> 2*x;
        System.out.println(unaryOperator.apply(2));
    }
}
