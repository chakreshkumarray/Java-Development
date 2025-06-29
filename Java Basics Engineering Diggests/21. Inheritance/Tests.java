package ConstructorCall;

public class Tests {
    public static void main(String[] args) {

        Childs childs = new Childs(); // constructor call
        childs.setAge(12);

        Parents parents = new Parents();
        parents.setAge(45);
        System.out.println(parents.getAge());

        GrandParents grandParents = new GrandParents();
        grandParents.setName("Ram");
        System.out.println(grandParents.getName());
    }
}
