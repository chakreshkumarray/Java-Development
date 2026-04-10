public class F3_Pattern {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("* * * *");
        System.out.println("* * * * *");

        System.out.println("* * * * *");
        System.out.println("* * * *");
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");

        System.out.println("        *");
        System.out.println("      * *");
        System.out.println("    * * *");
        System.out.println("  * * * *");
        System.out.println("* * * * *");
    }
}
/*
Q. What is JDK?
Ans. JDK (Java Development Kit)
     JDK is used to develop (write + compile + run) Java programs.
     It includes:JRE, Compiler (javac), Tools (debugger, etc.)
     JDK = JRE + Development Tools

Q. What is JRE?
Ans. JRE provides the environment to run Java programs.
     It includes: JVM, Core libraries (like java.lang, java.util)
     JRE = JVM + Libraries

Q. What is JVM?
Ans. JVM is a java virtual machine that runs Java bytecode.
     What it does:
     Executes .class (bytecode) files
     Converts bytecode → machine code
     Makes Java platform-independent
     JVM is platform-dependent (different for Windows, Linux, etc.)

Q. What is JIT?
Ans. JIT is a part of JVM that improves performance by compiling bytecode into native machine code at runtime.
     What it does:
     Converts frequently used code into machine code
     Makes execution faster
     Repeated code runs faster after JIT optimization

Q. Java is Compiler language or Interpreter Language?
Ans. Java is technically both a compiled and an interpreted language
    (i). Compiler Phase:
         A compiler converts the entire Java source code into bytecode before execution.
         Compiler name: javac
         Converts: .java  →  .class (bytecode)
         Works before execution
         Converts whole program at once
         Errors shown after compilation

    (ii). Interpreter Phase:
          An interpreter executes bytecode line by line at runtime.
          JVM acts as an interpreter
          It reads .class file and executes it
          Works during execution
          Executes line by line
          Slower than compiled code (without JIT)

 */