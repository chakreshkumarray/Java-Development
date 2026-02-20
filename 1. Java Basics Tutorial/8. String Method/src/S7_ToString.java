public class S7_ToString {

    String name;
    int age;
    int rollNumber;
    String house;

    public S7_ToString(String name, int age, int rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    @Override
    public String toString() {
        return "S7_ToString details{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollNumber=" + rollNumber +
                ", house='" + house + '\'' +
                '}';
    }


}
