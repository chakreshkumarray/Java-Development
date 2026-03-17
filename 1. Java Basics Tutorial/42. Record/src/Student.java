public record Student(int id, String name) {
    /*
    In Java, a record is a special type of class introduced and officially released in Java 16.
    It is used to create immutable data carrier classes with less boilerplate code.

    record is used when you only want to store data and avoid writing repetitive code like:
    constructors
    getters
    toString()
    equals()
    hashCode()

     Problem with Normal Class

    class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
     */


}
