public class Test {
    public static void main(String[] args) {

       /* Student  student = new Student();
        Student  student1 = new Student();
        Student  student2 = new Student();
        Student  student3 = new Student();
        Student  student4 = new Student();
        Student  student5 = new Student();*/

        Student.getCount();

        System.out.println(Utils.max(12,45));
        System.out.println(Utils.min(12,65));

        String str =  Utils.upperCase("chakresh");
        System.out.println(str);

        School_SingleTun.getInstance(); // call Single tun design Pattern

    }


}
