package Map.HashMap.Comparable;
import java.util.Objects;

public class Student implements Comparable<Student>{

    private String name;
    private double gpa;

    public Student(String name , double gpa){
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(gpa, student.gpa) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gpa);
    }

    public double getGpa(){
        return gpa;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
