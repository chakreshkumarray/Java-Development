package GarbageCollection;

public class Student {

    private final String name;
    private final String id;
    private int age;
    private int std;

    public Student(String name, String id, int age, int std) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.std = std;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public int getStd() {
        return std;
    }
}
