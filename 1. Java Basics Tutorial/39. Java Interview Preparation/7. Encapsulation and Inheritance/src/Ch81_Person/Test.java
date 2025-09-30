package Ch81_Person;

public class Test {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.equals(person));
        System.out.println(person.hashCode());
        System.out.println(person);
    }
}
