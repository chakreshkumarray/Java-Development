public class Employee {

    int empId;
    String name;
    static String company = "IBM";

    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;

    }

    void display(){
        System.out.println(empId+" "+name+ " "+company);
    }

}
