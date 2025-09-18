package UpCastingDownCasting;

public class Test {
    public static void main(String[] args) {

        Animal dog = new Dog(); // UpCasting
        dog.sayHello();         //----> Not Accessible SayBye();


        Dog dog1 = (Dog) dog; // DownCasting
        dog1.eat();
        dog1.sayBye();


    }
}
