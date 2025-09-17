package Methods;

public class Students {
    public static void main(String[] args) {
        Student x = new Student();
        x.id = 1;
        fun(x);
        System.out.println(x.id);

    }
    private static void fun(Student a){

        // Output will be 1 . Variable change
        Student student = new Student();
        student.id = 2;
        a = student;


        // Output will be 2 . Object change
        a.id=2;
    }

}




