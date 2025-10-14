package StaticMethods;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();

        Animal.info();  // static can be accessible without make object of class
    }
}
