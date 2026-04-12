package Protected;

public class Animal {
    private String name;
    protected String sound;

    public Animal(String name , String sound){
        this.name = name;
        this.sound = sound;
    }

    public void makeSound(){
        System.out.println(name + " makes a sound: "+ sound);

    }

    protected  void changeSound(String newSound){
        this.sound = newSound;
    }
}
/*
🔷 1. What are Access Modifiers?
Ans. Access modifiers are keywords used to control the visibility (accessibility) of
     classes, variables, methods, and constructors.

| Modifier  | Same Class | Same Package | Subclass  | Other Package            |
| --------- | ---------- | ------------ | ----------| -------------------------|
| private   | ✔          | ❌           | ❌       | ❌                       |
| default   | ✔          | ✔            | ❌       | ❌                       |
| protected | ✔          | ✔            | ✔        | ❌ (without inheritance) |
| public    | ✔          | ✔            | ✔        | ✔                        |

 */