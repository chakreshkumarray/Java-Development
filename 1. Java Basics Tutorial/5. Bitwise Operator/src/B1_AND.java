public class B1_AND {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int AND = a & b;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        System.out.println("And Of a and b :"+AND);
    }
}
/*
Q. What is Bitwise Operator?
Ans. Bitwise operators are used to perform operations directly on the binary (bit-level) representation of numbers.

| Operator | Name        | Example | Result |   |
| -------- | ----------- | ------- | ------ | - |
| `&`      | AND         | 5 & 3   | 1      |   |
| `|`      | OR          | 5 | 3   | 7      |   |
| `^`      | XOR         | 5 ^ 3   | 6      |   |
| `~`      | NOT         | ~5      | -6     |   |
| `<<`     | Left Shift  | 5 << 1  | 10     |   |
| `>>`     | Right Shift | 5 >> 1  | 2      |   |

Bitwise AND(&)
5 = 101
3 = 011
---------
    001 = 1
 */