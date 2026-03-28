public class F4_Main {
    public static void main(String[] args) {
        System.out.println("Welcome Ck Ray");
    }
}
/*
🧠 1. Basic Interview Questions
❓ What is a class in Java?
A class is a blueprint for creating objects.
Here, F4_Main is a class.

❓ Why is the class declared public?
public means the class is accessible from anywhere.
If not public → access is restricted.

❓ Why is the class name F4_Main?
It must match the file name: F4_Main.java
Java is case-sensitive

🚀 2. Main Method Deep Questions

❓ Why is main() method important?
It is the entry point of any Java program.
JVM starts execution from main().

❓ Explain this line:
public static void main(String[] args)

Breakdown:

✔ public
Accessible everywhere

JVM must access it
✔ static

No object needed to call main()
JVM calls it directly

✔ void
It does not return anything

✔ main
Predefined method name recognized by JVM

✔ String[] args
Used to pass command-line arguments

Example:

java F4_Main Hello
🔥 3. JVM & Execution Flow Questions
❓ What happens when you run this program?

Execution flow:

Compile:
javac F4_Main.java

Bytecode generated → F4_Main.class
JVM loads class

Calls main() method
Executes print statement

❓ What is JVM?
Java Virtual Machine
Runs Java bytecode

❓ What is JDK, JRE, JVM?
Component	Description
JDK	Development Kit
JRE	Runtime Environment
JVM	Executes bytecode

🖨️ 4. Output Statement Questions
❓ What is System.out.println()?

Breakdown:
System → class
out → static object (PrintStream)
println() → method to print with newline

❓ Difference between print() and println()?
Method	Behavior
print	Same line
println	Next line

❓ Can we replace System.out.println?
Yes:
import static java.lang.System.out;
out.println("Hello");

⚡ 5. String Related Questions
❓ What is "Welcome Ck Ray"?
A String literal
Stored in String Constant Pool

❓ Are Strings mutable?
No → Strings are immutable

🔐 6. Advanced Interview Questions

❓ Can we run program without main()?
👉 Yes (old versions):
Using static block (before Java 7)

❓ Can we overload main()?
👉 Yes:
public static void main(int a) {}
But JVM only calls:
public static void main(String[] args)

❓ Can we change String[] args name?
👉 Yes:
public static void main(String[] ck)

❓ Can we write:
public static void main(String args[])
👉 Yes (both are valid)

🧩 7. Tricky Questions

❓ What if main is not static?
❌ Compile error:
JVM cannot call it

❓ What if main is private?
❌ Runtime error

❓ What if class is not public?
✔ Works fine if filename matches

❓ What if no semicolon?
❌ Compile-time error

🔄 8. Variations Interviewers Ask
✔ Print without println()
System.out.print("Welcome Ck Ray");
✔ Using printf
System.out.printf("Welcome %s", "Ck Ray");
✔ Multi-line print
System.out.println("Hello\nWorld");
🧪 9. Coding-Based Follow-up Questions

Interviewers may ask you to modify:

✔ Take input from user
✔ Print dynamic message
✔ Use loop to print multiple times

Example:

for(int i=0;i<3;i++){
    System.out.println("Welcome Ck Ray");
}

  1. What is the correct file name for this code?
A. Main.java
B. F4_Main.java ✅
C. f4_main.java
D. Any name

2. What happens if file name ≠ class name?
A. Compile error ✅
B. Runtime error
C. No error
D. Warning

3. Which keyword makes class globally accessible?
A. static
B. public ✅
C. void
D. final

4. Can a Java file have multiple classes?
A. No
B. Yes ✅
C. Only one allowed
D. Only abstract classes

5. Which class can be public in a file?
A. Any number
B. Only one ✅
C. Two
D. None

6. What if class is not public?
A. Compile error
B. Works fine ✅
C. Runtime error
D. JVM crash

7. Java is:
A. Case-insensitive
B. Case-sensitive ✅
C. Both
D. None

8. Which is valid class name?
A. 4Main
B. Main-1
C. _Main ✅
D. Main@

9. Which keyword is mandatory in class?
A. public
B. class ✅
C. static
D. void

10. Default access modifier of class?
A. private
B. protected
C. default ✅
D. public

🔹 Section 2: Main Method (Q11–Q25)
11. Entry point of Java program?
A. start()
B. run()
C. main() ✅
D. init()

12. JVM calls:
A. Any method
B. main(String[] args) ✅
C. main()
D. constructor

13. Why main is static?
A. Performance
B. Memory
C. JVM calls without object ✅
D. Required by compiler

14. Valid main signature?
A. public static void main(String args[]) ✅
B. public void main(String[] args)
C. static void main()
D. private static main()

15. Can we change args name?
A. No
B. Yes ✅
C. Only in Java 8
D. Only with final

16. What if main is not static?
A. Works fine
B. Compile error
C. Runtime error ✅
D. Warning

17. Can we overload main?
A. No
B. Yes ✅
C. Only once
D. Only static

18. JVM executes which main?
A. Overloaded
B. Any
C. Exact signature ✅
D. First one

19. Return type of main?
A. int
B. String
C. void ✅
D. boolean

20. Can main be final?
A. No
B. Yes ✅
C. Only private
D. Only static

21. Can main throw exception?
A. No
B. Yes ✅
C. Only runtime
D. Only checked

22. Is main method mandatory?
A. Yes (for execution) ✅
B. No
C. Optional
D. Only for classes

23. Can main be private?
A. Yes
B. No (runtime error) ✅
C. Compile error
D. JVM ignores

24. Which is invalid?
A. public static void main(String[] args)
B. public static void main(String args[])
C. public void static main(String[] args) ✅
D. public static void main(String... args)

25. What is args?
A. Array
B. Object
C. String array ✅
D. List

🔹 Section 3: Output Statement (Q26–Q35)
26. System is:
A. Method
B. Object
C. Class ✅
D. Package

27. out is:
A. Method
B. Variable
C. Object ✅
D. Class

28. println() belongs to:
A. Scanner
B. PrintStream ✅
C. String
D. System

29. print vs println difference?
A. Speed
B. Memory
C. New line ✅
D. Syntax

30. Output of code?
System.out.print("A");
System.out.print("B");
A. A B
B. AB ✅
C. A\nB
D. Error

31. Output?
System.out.println("A");
System.out.print("B");
A. AB
B. A B
C. A\nB ✅
D. Error

32. What does println return?
A. String
B. int
C. void ✅
D. boolean

33. Can we use System without import?
A. No
B. Yes ✅
C. Only Java 8
D. Only static

34. Package of System class?
A. java.util
B. java.io
C. java.lang ✅
D. java.system

35. Default import in Java?
A. java.util
B. java.lang ✅
C. java.io
D. none

🔹 Section 4: String & Memory (Q36–Q45)
36. "Welcome Ck Ray" is:
A. Object
B. Literal ✅
C. Variable
D. Class

37. Strings are:
A. Mutable
B. Immutable ✅
C. Both
D. None

38. Stored in:
A. Heap
B. Stack
C. String Pool ✅
D. Method Area

39. String class belongs to:
A. java.util
B. java.lang ✅
C. java.io
D. java.string

40. Can we modify string?
A. Yes
B. No ✅
C. Only final
D. Only static

41. String is:
A. Primitive
B. Object ✅
C. Interface
D. Abstract

42. New keyword creates:
A. Stack memory
B. Heap memory ✅
C. Pool only
D. None

43. Literal vs new difference?
A. Memory
B. Performance
C. Pool usage
D. All ✅

44. String pool improves:
A. Speed
B. Memory ✅
C. CPU
D. Security

45. Can two literals share memory?
A. No
B. Yes ✅
C. Only static
D. Only final

🔹 Section 5: JVM & Execution (Q46–Q50)
46. Java compilation creates:
A. .exe
B. .class ✅
C. .java
D. .byte

47. JVM executes:
A. Source code
B. Bytecode ✅
C. Machine code
D. Script

48. JDK includes:
A. JVM
B. JRE
C. Compiler
D. All ✅

49. JRE includes:
A. JVM
B. Libraries
C. Both ✅
D. Compiler

50. Which runs Java program?
A. Compiler
B. JVM ✅
C. JDK
D. Editor
 */