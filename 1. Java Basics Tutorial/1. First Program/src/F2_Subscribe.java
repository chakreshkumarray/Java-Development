public class F2_Subscribe {
    public static void main(String[] args) {
        System.out.println("Subscribe");
    }
}
/*
Q. Why did you choose Java?
Ans. I chose Java because it is platform-independent, object-oriented, and widely used in industry.
     It helps me build secure, scalable, and robust applications. Also, Java has strong community support
     and is used in areas like web development, enterprise applications, and Android development, which gives
     me good career opportunities.

     I chose Java because it is platform-independent, secure, and widely used for building scalable applications,
     which makes it a strong language for my career.

     I chose Java because of its real-world usage and stability. It is used in many enterprise applications, and
     I like its object-oriented approach and strong features like memory management and multithreading.
     Also, it offers good job opportunities.

Q. Why do we need to declare class public?
Ans. Access modifier
     It means this class/method can be accessed from anywhere
     JVM needs to access main() method to start execution

Q. What is class?
Ans. A blueprint/template to create objects
     Like a Car blueprint → actual cars are objects

Q. What is Main?
Ans. Class name
     Can be anything (but must match file name: Main.java)

Q. Why { } (Curly Braces) ?
Ans. Defines the scope/block of code
     Everything inside belongs to that class or method

Q. Why public static void main(String[] args)?
Ans. (a) public
     JVM can access it from anywhere
     (b) static
     Belongs to class, not object
     Why needed?
     JVM calls main() without creating object
     So method must be static
     (c) void
     Method returns nothing
     (d) main
     Starting point of program execution
     JVM always looks for this method
     (e) String[] args
     Command-line arguments
     java Main hello
     "hello" goes into args

Q. JVM Execution Flow (Deep Understanding)
Ans. You write code → Main.java
     Compile: javac Main.java
     Generates bytecode (Main.class)
     Run: java Main
     JVM: Loads class
     Finds main()
     Executes it
 */