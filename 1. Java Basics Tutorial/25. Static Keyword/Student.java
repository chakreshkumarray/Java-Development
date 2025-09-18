public class Student {

    private int id;
    private String name;
    private int age;

    public static int count = 0; // Static Member

    public Student(){ // constructor
        count++;
    }

    public static void getCount(){ // Static Method
        System.out.println("Total Student: " + count);
    }

    static {                       // Static Block
        System.out.println("hello");
        //count = 22;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

}
