public class Car {

    // Declaration of class
    String color;
    String brand;
    String model;
    int year;
    int speed;

    public void accelerate(int increment){
        speed = speed + increment;
        System.out.println("Car is Running");
    }

    public void brake(int decrement){
        speed = speed - decrement;
        if(speed <= 0){
            speed = 0;
            System.out.println("break");
        }else {
            System.out.println("Slow");
        }
    }

}
/*
OOPs (Object-Oriented Programming System) is a programming concept where we organize code
using objects and classes instead of just functions and logic.

1. Class
A class is a blueprint/template.

2. Object
An object is an instance of a class.

3. Encapsulation (Data Hiding + Security)
Wrapping data + methods into one unit (class) and restricting access.

4. Inheritance (Code Reusability)
One class acquires properties of another class.

5. Polymorphism (Many Forms)
➤ Compile-time (Method Overloading)
➤ Runtime (Method Overriding)

6. Abstraction (Hiding Implementation)
Using Abstract Class
Using Interface
 */
