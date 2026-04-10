public class A4_Associativity_Precedence {
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
/*
Q. What is Precedence?
Ans. Precedence tells which operator is executed first when multiple operators are present.

Q. What is Associativity?
Ans. Associativity tells which direction to evaluate when operators have same precedence.
     Top to Bottom
     Left to Right (→)
 */