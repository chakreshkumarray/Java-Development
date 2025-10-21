package Single_Inheritance;
public class Animal {  // Inherit by dog
    private String name;
    private int age;

    public  void eat(){
        System.out.println("This animal eats food.");
    }

    public void sayHello(){
        System.out.println("Bhau Bhau.");
    }

    // Setter Method for setting 'name' property of Animal
    public void setName(String name){
        this.name=name;    //Assign the parameter 'name' to the instance variable (this.name) 'name' 
    }

     // Setter Method for setting 'age' property of Animal
    public void setAge(int age){
        this.age = age;    //Assign the parameter 'age' to the instance variable (this.age) 'age' 
    }

    // Getter Method for getting 'name' property of Animal
    public String getName(){
        return name;    // Returns the value of animal 'name' property
    }
    
    // Getter Method for getting 'age' property of Animal
    public int getAge(){
        return age;    // Returns the value of animal 'age' property
    }
}
