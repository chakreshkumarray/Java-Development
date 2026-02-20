

public class Student {
    String name;
    int age;
    int rollNumber;
    String house;

    public Student(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "Student details{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", house='" + house + '\'' +
                '}';
    }


}
