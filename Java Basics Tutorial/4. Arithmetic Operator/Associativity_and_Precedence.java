public class Associativity_and_Precedence {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        int c = a / b + 3;
        System.out.println(c);

        int a1 = 10;
        int b1 = 5;
        int c1 = a1 / b1 * 3;
        System.out.println(c1);


        int a2 = 10;
        int b2 = 5;
        int c2 = a2 / b2 + 3 * 2 - 1;
        System.out.println(c2);


    }
}
