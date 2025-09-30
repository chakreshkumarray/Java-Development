package MultiLevelInheritance;
public class Test {
    public static void main(String[] args) {

        Child child = new Child(); // constructor call
        child.setAge(13);

        Parent parent = new Parent();
        parent.setAge(45);
        System.out.println(parent.getAge());

        GrandParent grandParent = new GrandParent();
        grandParent.setName("Ram");
        System.out.println(grandParent.getName());

    }
}
