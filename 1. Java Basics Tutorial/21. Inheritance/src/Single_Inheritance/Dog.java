package Single_Inheritance;

/*public class Dog{  can remove using extends
        String name;
        int age;
     }*/


public class Dog extends Animal{
  // Constructor for Dog class, which initializes the instance's name and age property using setter methods
  public Dog(String name, int age){
          setName(name);        // Set the name of the dog using the inherited (parent class) setName() method
          setAge(age);        // Set the age of the dog using the inherited (parent class) setAge() method
  }

  //Overriding the sayHello() method to give different sound for Dog
  @Override
  public void sayHello(){
    System.out.println("Wolf"); // Dog say "wolf" instead of "Bhau Bhau"
  }

}
