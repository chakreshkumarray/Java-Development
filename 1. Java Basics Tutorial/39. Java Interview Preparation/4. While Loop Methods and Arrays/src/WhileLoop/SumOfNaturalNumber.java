package WhileLoop;

public class SumOfNaturalNumber {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 1; i <= 20; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Natural Number: "+sum);
    }
}
