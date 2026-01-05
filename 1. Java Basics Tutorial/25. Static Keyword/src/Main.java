public class Main {
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

        Student.getCount();

        System.out.println(Student.count);
        int c = sum(12,12);
        Utils.fact(5);
        Utils.sum(12,55);

    }

    public static int sum(int a,int b){
        return a+b;
    }
}