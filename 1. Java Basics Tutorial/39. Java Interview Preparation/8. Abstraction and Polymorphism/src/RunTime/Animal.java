package RunTime;

public class Animal {
    private String name;
    private int age;

    // Setter Method
    public void sayHello(){
        System.out.println("...");
    }

    public void eat(){
        System.out.println("This animal eats food..");
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Getter Method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
