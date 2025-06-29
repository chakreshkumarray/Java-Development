package SuperKeyword;

public class GrandParent {

    private String name;
    private int age;

    // Setter Method
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

    // Getter Method
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }
}
