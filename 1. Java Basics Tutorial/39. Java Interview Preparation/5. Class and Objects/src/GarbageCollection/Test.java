package GarbageCollection;

public class Test {
    public static void main(String[] args) {

        Student student = null; // this null keyword generate garbage collection

        Student student1 = new Student("ck","SOS",23,12);

        System.out.println(student1.getAge());
    }
}
