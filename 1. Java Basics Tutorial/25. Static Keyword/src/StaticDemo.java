public class StaticDemo {

    /*
    don't need to create object if we use static with in class
    i. Static block executes automatically when the class is loaded in the memory
     */
    static void display(){
        System.out.println("1");
    }

    /*
    * void display(){
        System.out.println("1");
    }
    */


    public static void main(String[] args) {
        display();
    }

    /*
    i. Static methods belongs to the class, not to the object.
    ii. A static method can be accessed directly by class name and does not need any object
    iii. A static method can access only static data. It can not access non-static data(instance data).
    iv. A static method can call only other static methods and can not call a non-static method.
    v. A "static" method can not refer to "this" or "super" keyword in any way.
     */

    /*Keywords are reserved words in Java that define specific behavior of the program. They are used to
    control flow, define structure, and manage memory and access in a standardized way.*/

}
