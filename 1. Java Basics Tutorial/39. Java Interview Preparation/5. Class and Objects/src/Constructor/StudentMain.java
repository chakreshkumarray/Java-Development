package Constructor;

public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("ck",15,1,"OS","denis richie");
        /*
         *  Student student = new Student();
           +--------------------+
           +   Student_Class(); +----------> This is constructor
           +--------------------+

         default value
         student.getName();  default value
         student.getStandard();  default value
         over load access
         System.out.println(student.getName()); overload remark ck
         */
        System.out.println(student.getName());
        System.out.println(student.getStandard());
        System.out.println(student.getAuthor()); // customize constructor print
        System.out.println(student.getSubject());
        System.out.println(student.getAge());

        // Adding new object
        Student student1 = new Student("Raman");
        System.out.println(student1.getAuthor());

        // Adding also new object
        Student student2 = new Student(21);
        System.out.println(student2.getAge());

    }
}
