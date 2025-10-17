package RunTimePolymorphism;

public class Test {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();
        animal.sayHello();

        Dog dog = new Dog();
        dog.sayHello();

        Cat cat = new Cat();
        cat.sayHello();

    }
}
