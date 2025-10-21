package Single_Inheritance;

public class Test {
  public static void main(String[] args) {
    // Creating an instance of Dog class 
    Dog dog = new Dog("Buddy",5);  // Initializing the dog with name "Buddy" and age 5

    // Displaying the dog's name and age using getter methods
    System.out.println("Dog's name: "+dog.getName());  
    System.out.println("Dog's age: "+dog.getAge());

    //Calling the sayHello() method of the dog. Since it has overridden the method of the Animal class, it will print "Wolf"
    dog.sayHello();  // Output: Wolf

    // Calling the eat() method of the dog. Since Dog class doesn't override eat() method of the Animal class, so Animal class's eat() will be called
    dog.eat(); // Output: This animal eats food.
    
  }
}
