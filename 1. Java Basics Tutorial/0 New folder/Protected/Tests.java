package Protected;

public class Tests {
    public static void main(String[] args) {

        Dog dog = new Dog("Bob");
        dog.makeSound();

        dog.setDogSound("Woof");
        dog.makeSound();

        dog.wagTail();

        // dog.changeSound("wolf"); Not Accessible  because protected .

    }
}
