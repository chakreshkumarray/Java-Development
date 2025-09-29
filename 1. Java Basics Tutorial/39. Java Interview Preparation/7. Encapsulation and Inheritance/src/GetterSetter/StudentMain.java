package GetterSetter;
public class StudentMain {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("CK");
        student.setAge(23);
        student.setId(4562);
        student.setCgpa(7.14);
        student.setFees(65474);
        student.setRollNumber(205423);

        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getCgpa());
    }
}
