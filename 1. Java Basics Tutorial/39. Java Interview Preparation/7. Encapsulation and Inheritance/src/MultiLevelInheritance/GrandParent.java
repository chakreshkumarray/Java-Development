package MultiLevelInheritance;
public class GrandParent{

    private  String name;
    private  int age;
    private final boolean hasSuperPower;

    // Setter Method
    public boolean hasSuperPower(){
        return hasSuperPower;
    }
    public GrandParent(){
        hasSuperPower = false;
        System.out.println("GrandParent Constructor Call..");
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
