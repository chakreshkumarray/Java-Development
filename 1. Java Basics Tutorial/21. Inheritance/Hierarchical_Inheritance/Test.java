package Hierarchical_Inheritance;

public class Test {
  public static void main(String[] args) {
    
    Animal animal = new Animal();
    animal.eat();
    animal.sayHello();

    Cat cat = new Cat();
    cat.SayHello();
    cat.eat();

    Dog dog = new Dog();
    dog.eat();
    dog.sayHello();
  }
  
}
