package WhileLoop;

public class PatternPrint {
    public static void main(String[] args) {

        int i = 1;
        while (i <= 5){
            System.out.print("*");
            int j = 1;
            while (j < i){
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
