public class Student {

    String name;
    String college;
    int age;
    int id;
    double fees;

    public Student(String name, String college, int age, int id, double fees) {
        this.name = name;
        this.college = college;
        this.age = age;
        this.id = id;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public String getCollege() {
        return college;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    public double getFees() {
        return fees;
    }

}
