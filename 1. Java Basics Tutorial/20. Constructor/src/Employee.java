public class Employee {

    String Name;
    int emp_id;

    // here default constructor
    // also use super();

    Employee(String Name,int emp_id){ // this is constructor
        this.Name = Name;
        this.emp_id = emp_id;
    }

    Employee(){ // Default

    }

    /*
Q. What is a Constructor?
Ans.  A constructor is a special method used to initialize objects.
      It is called automatically when an object is created.

Q. Key Rules (Must Remember 🔥)
Ans. Constructor name = class name
     No return type (not even void)
     Called automatically
     Used to initialize object

Types of Constructors
🔹 1. Default Constructor

Provided by Java (if you don’t create one)

class Test {
    // compiler provides default constructor
}

🔹 2. No-Argument Constructor
class Test {
    Test() {
        System.out.println("No-arg constructor");
    }
}

🔹 3. Parameterized Constructor
class Test {
    int x;

    Test(int x) {
        this.x = x;
    }
}

🔸 1. Constructor Overloading

Same constructor name, different parameters

class Test {
    Test() {}
    Test(int a) {}
    Test(int a, int b) {}
}

🔸 2. this() Constructor Chaining

Calls another constructor of same class

class Test {
    Test() {
        this(10);
        System.out.println("Default");
    }

    Test(int x) {
        System.out.println(x);
    }
}

🔸 3. super() Constructor Call

Calls parent class constructor

class A {
    A() {
        System.out.println("Parent");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Child");
    }
}

🔸 5. Private Constructor

Used to restrict object creation

class Test {
    private Test() {}
}

👉 Used in:

Singleton design pattern
     */
}
