package SuperKeyword;

public class Test {
    public static void main(String[] args) {

        Child child = new Child(15,"ck."); // argument by super keyword
        child.childMethod(); // parent method call
        System.out.println(child.getAge());
        System.out.println(child.getName());

    }
}
