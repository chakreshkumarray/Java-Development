package SingletonPattern;

public class Test {
    public static void main(String[] args) {

        School.getInstance(); // create only one time
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();
        School.getInstance();

        Student school = new Student(); // public
        school.sayBye();


    }
}
