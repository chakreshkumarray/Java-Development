package AbstractKeyword;

public class Test {
  public static void main(String[] args){

    Animal animal = new Cat(); // ✔ Object of Cat ✔ Reference of Animal, we can not create object of abstract class.
    animal.sleep();
    animal.sayHello();

    Dog dog = new Dog();
    dog.sayHello();

  }
}
/*
 There are two things in this line:

1. Reference Type → Animal
Determines what methods/variables you can access at compile time
2. Object Type → Cat
Determines which method actually runs at runtime

The reference type is Animal, but the actual object created is of type Cat. So at runtime,
Cat’s methods will be executed, but at compile time, only Animal’s methods are accessible.
 */