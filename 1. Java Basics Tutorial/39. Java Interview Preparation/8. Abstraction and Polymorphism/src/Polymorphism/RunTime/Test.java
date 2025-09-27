package Polymorphism.RunTime;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sayHello();

        Animal dog = new Dog();
        dog.sayHello();

        Animal cat = new Cat();
        cat.sayHello();

    }
}
