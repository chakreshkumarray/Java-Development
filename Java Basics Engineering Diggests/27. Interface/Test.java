package StaticMethods;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.eat();

        Animal.info();  // static access without make object

    }
}
