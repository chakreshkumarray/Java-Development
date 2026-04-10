public class F4_Main {
    public static void main(String[] args) {
        System.out.println("Welcome Ck Ray");
    }
}
/*
Q. Memory Management When Program Executes?
Ans. Java memory management is handled by JVM using stack, heap, and method area.
     Stack stores method calls and local variables, heap stores objects, and method area stores class metadata.
     Java uses garbage collection to automatically manage memory by removing unused objects, improving performance
     and preventing memory leaks

     Heap Memory
     Stack Memory
     Method Area (Metaspace)
     PC Register
     Native Method Stack

     1. Stack Memory
     Method calls, Local variables, Function execution
     int a = 10;
     Stored in stack
     Features: Fast access ⚡, Automatically managed, Follows LIFO (Last In First Out)

     2. Heap Memory
     Objects and instance variables
     Student s = new Student();

     3. Method Area
     Class information
     Static variables
     Method data

     4. PC Register
     Address of current executing instruction

     5. Native Method Stack
     Native (C/C++) methods via JNI

Q. Garbage Collection ?
Ans.Objects are created in heap memory by JVM when we use the new keyword.
    Garbage collection is handled automatically by the JVM, which removes objects
    that are no longer referenced. It works using phases like mark, sweep, and compact.
    Developers can help by avoiding memory leaks and releasing unused references, but the
    JVM ultimately manages memory and GC execution.

    Student s = new Student();

    JVM checks class in Method Area
    Allocates memory in Heap (Eden space)
    Initializes object
    Returns reference → stored in Stack

    When Object Becomes Eligible for Garbage Collection?
    An object is eligible when no reference points to it.
    Student s = null; this is eligible of GC.

    How Problems Are Resolved?
    Developer + JVM tuning

   Developer Responsibilities
   Remove unused references:
   obj = null;
   Avoid memory leaks
   Use proper data structures
   Close resources (DB, files)
 */