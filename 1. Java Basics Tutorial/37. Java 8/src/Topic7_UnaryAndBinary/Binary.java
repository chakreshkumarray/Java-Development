package Topic7_UnaryAndBinary;

import java.util.function.BinaryOperator;

public class Binary {
    public static void main(String[] args) {
        BinaryOperator<Integer> binaryOperator = (x,y) -> x+y;
        System.out.println(binaryOperator.apply(2,7));
    }
}
