/*
Super Keyword --> Super Keyword is a reference variable which is used to refer
                  immediate parent class object
 */
public class GrandParent {

    private String name;
    private int age;

    // Setter
    public GrandParent(int age , String name){
        this.age = age;
        this.name = name;
        System.out.println("Ram Laut Constructor call");
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    // Getter
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
