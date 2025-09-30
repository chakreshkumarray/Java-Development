package Ch81_Person;

import java.util.Objects;

public class Person {
    String name;
    int age;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person details{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
