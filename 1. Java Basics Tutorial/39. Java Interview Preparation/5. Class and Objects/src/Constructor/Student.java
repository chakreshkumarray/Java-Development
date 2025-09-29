package Constructor;

public class Student {
    private String name;
    private int age;
    private int standard;
    private String subject;
    private String author;

    /*
     *  overload constructor
       public Student (){   over load
       this.name="Chakresh kumar"; // remark ck
     }
     */
    // Parametrized constructor Also setter Method
    public Student(String name, int age, int standard, String subject, String author){
        this.name=name;
        this.age=age;
        this.standard=standard;
        this.subject=subject;
        this.author=author;
    }
    public Student(String author){  // overloading author
        this.author=author;
    }
    public Student(int age){  // overload age
        this.age=age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setStandard(int standard){
        this.standard=standard;
    }
    public void setSubject(String subject){
        this.subject=subject;
    }
    public void setAuthor(String author){
        this.author=author;
    }

    // Getter Method
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getStandard(){
        return standard;
    }
    public String getSubject(){
        return subject;
    }
    public String getAuthor(){
        return author;
    }
}
