package To_3_List.Comparator;

public class Student {

    String Name;
    Double Gpa;

    Student(String Name,Double Gpa){
        this.Name = Name;
        this.Gpa = Gpa;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getGpa() {
        return Gpa;
    }

    public void setGpa(Double gpa) {
        Gpa = gpa;
    }

}
