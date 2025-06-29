package Abstraction;

public abstract class Animal {
    private String name;
    private int age;

    // Abstract Method
    public abstract void sayHello(); // Protected / Abstract Method

    // Setter Method
    public void sleep(){   // Concrete Method
        System.out.println("zzz... ");
    }

    public  boolean hasSuperPower;

    protected Animal(){       // Animal Constructor
        this.hasSuperPower  = false;
    }

    public void eat(){
        System.out.println("This animal eats food..");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter Method
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
