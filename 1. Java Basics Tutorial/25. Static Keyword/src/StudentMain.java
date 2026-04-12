public class StudentMain {
    public static void main(String[] args){

        Student student1 = new Student();
        student1.setAge(23);
        student1.setName("ck");
        student1.setId(103);

        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        Student student6 = new Student();
        Student student7 = new Student();

        System.out.println(student1.getName());
        System.out.println(student1.getAge());
        System.out.println(student1.getId());

        Student.getCount();

        System.out.println(Student.count);
        int c = sum(12,13);
        System.out.println(c);

    }

    public static int sum(int a,int b){
        return a + b;
    }
}