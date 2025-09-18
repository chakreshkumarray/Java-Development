package LAMDA_Expression_12;

public class StudentTest {
    public static void main(String[] args) {

        EngineeringStudent engineeringStudent = new EngineeringStudent();

        String student = engineeringStudent.getBio("Chalk");
        System.out.println(student);
        // OR

        Student student1 = new Student() {
            @Override
            public String getBio(String name) {
                return name+"is Engineering Student";
            }
        };
        String ck = student1.getBio("chk ");
        System.out.println(ck);

        // Lambda
        Student student2 = (name)-> {return "ck";};
        System.out.println(student2);
    }
}
