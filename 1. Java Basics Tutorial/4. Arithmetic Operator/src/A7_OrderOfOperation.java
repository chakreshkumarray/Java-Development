public class A7_OrderOfOperation {
    public static void main(String[] args) {

        System.out.println(9 % 3 / 3 * 5 + 8 - 4);
        System.out.println(8 % 23 / 5 * 6 + 4 - 3);
    }
}
/*
The order of operations tells you how an expression is evaluated step by step when multiple operators are used together.
Standard Order (High → Low Priority)
Parentheses ()
Unary operators ++, --, !
Multiplication / Division / Modulus *, /, %
Addition / Subtraction +, -
Relational operators <, >, <=, >=
Equality operators ==, !=
Logical AND &&
Logical OR ||
Assignment =, +=, -=, ...
 */