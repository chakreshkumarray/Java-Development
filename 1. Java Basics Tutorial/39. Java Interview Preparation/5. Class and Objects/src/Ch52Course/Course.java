package Ch52Course;

public class Course {

    String courseName;          // instance variable
    int enrollments;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
    }
    static int maxCapacity = 100; // static variable

    String[] enrolledStudents = new String[maxCapacity];

    public void enrollStudent (String studentName){  // instance methods
        enrolledStudents[enrollments] = studentName;
        enrollments++;
    }

    public void UnenrollStudent(String studentName){
        System.out.println("Student removed");
        enrolledStudents[enrollments] = studentName;
        enrollments--;
    }

    public static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }
}
