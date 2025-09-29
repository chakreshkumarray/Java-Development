package Ch52Course;

import java.util.Arrays;

public class CourseMain {
    public static void main(String[] args) {

        Course course = new Course("java");
        course.courseName = "java";
        course.enrollments = 0;
        course.enrollStudent("CK");
        System.out.println(course.enrollments);
        course.enrollStudent("Ak");
        System.out.println(course.courseName);
        System.out.println(course.enrollments);
        System.out.println(Arrays.toString(course.enrolledStudents));

    }
}
