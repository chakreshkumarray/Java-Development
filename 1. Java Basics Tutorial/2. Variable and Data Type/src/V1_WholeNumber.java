public class V1_WholeNumber {
    public static void main(String[] args) {

        byte age0 = -127;
        System.out.println(Byte.MIN_VALUE);
        System.out.println(Byte.MAX_VALUE);
        System.out.println(age0);

        short age1 = 32767;
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(age1);

        int age2 = 2147483647;
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(age2);

        long age3 = 9223372036854775807l;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(age3);
    }
}
/*
Q. What is Variable?
Ans. A variable is a named memory location that holds a value.
     int age = 25;
     int → data type (type of data)
     age → variable name
     25 → value stored in the variable

Q. What is declaration?
Ans. Declaration means creating a variable by specifying its data type and name.
     dataType variableName;
     int age;

Q. What is initialization?
Ans. Initialization means assigning a value to a variable.
     variableName = value;
     age = 25;

Q. What is Literal?
Ans. A literal is a fixed value written directly in the program.
     Literal = Declaration + Initialization
     int age = 25;
     int a;       Declaration
     a = 10;      Initialization
     int b = 20;  Declaration + Initialization

Q. What is Data Type and its Type in Java?
Ans. A data type defines:
     What kind of data a variable can store
     How much memory it uses
     What operations can be performed on it

     int age = 25; 4 bytes data store in integer

     Data Types in Java
     1. Primitive Data Types
     2. Non-Primitive (Reference) Data Types

     1. Primitive Data Types:
        Primitive data types are predefined by Java and are used to store single, simple values (not objects).

     8 Primitive Data Types
     | Type    | Size    | Range / Description        | Example                |
     | ------- | ------- | -------------------------- | ---------------------- |
     | byte    | 1 byte  | -128 to 127                | `byte b = 10;`         |
     | short   | 2 bytes | -32,768 to 32,767          | `short s = 1000;`      |
     | int     | 4 bytes | -2^31 to 2^31-1            | `int a = 100;`         |
     | long    | 8 bytes | very large integers        | `long l = 100L;`       |
     | float   | 4 bytes | decimal (6–7 precision)    | `float f = 3.14f;`     |
     | double  | 8 bytes | decimal (15 precision)     | `double d = 3.14159;`  |
     | char    | 2 bytes | single character (Unicode) | `char c = 'A';`        |
     | boolean | ~1 bit  | true/false                 | `boolean flag = true;` |

    2. Non-Primitive Data Types:
    These are user-defined or advanced types.
    String
    Array
    Class
    Object
    Interface

    | Feature      | Primitive    | Non-Primitive       |
    | ------------ | ------------ | ------------------- |
    | Memory       | Stack        | Heap                |
    | Stores       | Actual value | Reference (address) |
    | Size         | Fixed        | Dynamic             |
    | Null allowed | ❌ No        | ✅ Yes              |
    | Examples     | int, char    | String, Array       |

Q. Define Byte, Short, Int, Long ?
Ans. These type of data are whole number store integer value
        1. byte
        Size: 1 byte (8 bits)
        Range: -128 to 127
        Use: Save memory when working with small numbers
        Example: byte b = 100;

     2. short
        Size: 2 bytes (16 bits)
        Range: -32,768 to 32,767
        Example: short s = 20000;

     3. int
        Size: 4 bytes (32 bits)
        Range: -2³¹ to 2³¹ - 1
        Default type for integers
        Example: int a = 100000;

     4. long
        Size: 8 bytes (64 bits)
        Range: Very large numbers
        Must use L or l at the end
        Example: long l = 10000000000L;
 */